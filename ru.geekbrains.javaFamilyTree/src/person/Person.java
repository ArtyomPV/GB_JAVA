package person;

import java.util.ArrayList;
import java.util.List;

public class Person extends Human{
    private Person father;
    private Person mother;
    private List<Person> parents;
    private List <Person> siblings;
    private List<Person> children;

    public Person(String firstName, String lastName, Gender gender, int age) {
        super(firstName, lastName, gender, age);
        parents = new ArrayList<>();
        children = new ArrayList<>();
        siblings = new ArrayList<>();
    }

    public void setParents(Person father, Person mother) {
        this.parents.add(father);
        this.parents.add(mother);
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        parents.set(0, father);
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        parents.set(1, mother);
        this.mother = mother;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public Person addChild(Person child){
        children.add(child);
        return this;
    }
    public Person addSibling(Person sibling){
        siblings.add(sibling);
        return this;
    }
    public String  printParents() {
        StringBuilder content = new StringBuilder();
        if (parents != null && parents.size() != 0) {
            content.append("Parents of ").append(this).append(":\n");
            if (this.parents.get(0) != null) {
                content.append("\tFather:\t").append(this.parents.get(0)).append("\n");
            }
            if (this.parents.get(1) != null) {
                content.append("\tMother:\t").append(this.parents.get(1));
            }
            content.append("\n");
            return content.toString();
        }
        return String.format("Parents not listed");
    }

    public String  printChildren() {
        StringBuilder content = new StringBuilder();
        if (children != null && children.size() != 0) {
            content.append("Children of ").append(this).append(":\n");
            for(Person child : children){
                if(child.getGender().equals(Gender.Male)){
                    content.append("\tSon:\t\t").append(child).append("\n");
                } else {
                    content.append("\tDaughter:\t").append(child).append("\n");
                }
            }
            return content.toString();
        }
        return String.format("Children not listed");
    }

    public String  printSiblings() {
        StringBuilder content = new StringBuilder();
        if (siblings != null && siblings.size() != 0) {
            content.append("Siblings of ").append(this).append(":\n");
            for(Person sibling : siblings){
                if(sibling.getGender().equals(Gender.Male)){
                    content.append("\tBrother:\t\t").append(sibling).append("\n");
                } else {
                    content.append("\tSister:\t").append(sibling).append("\n");
                }
            }
            return content.toString();
        }
        return String.format("Siblings not listed");
    }
}
