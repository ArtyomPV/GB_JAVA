import person.Gender;
import person.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Artyom", "Prusov", Gender.Male, 46);
        Person person2 = new Person("Raisa", "Prusova", Gender.Female, 74);
        Person person3 = new Person("Vasiliy", "Prusov", Gender.Male, 81);
        Person person4 = new Person("Dariay", "Prusova", Gender.Female, 19);
        Person person5 = new Person("Evgen", "Prusov", Gender.Male, 21);
        Person person6 = new Person("Andrey", "Prusov", Gender.Male, 49);
        Person person7 = new Person("Arseniy", "Prusov", Gender.Male, 35);

        person1.setParents(person3, person2);
        person1.addChild(person4).addChild(person5);
        person1.addSibling(person6).addSibling(person7);
        String children = person1.printChildren();
        String parents = person1.printParents();
        String siblings = person1.printSiblings();
        System.out.println(parents);
        System.out.println(children);
        System.out.println(siblings);
        System.out.println(person1.getFullInfo());
    }
}