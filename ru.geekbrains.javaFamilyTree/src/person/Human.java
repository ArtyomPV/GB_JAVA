package person;

abstract class Human {
    private String firstName;
    private String lastName;
    Gender gender;
    int age;

    public Human(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(this.firstName + " " + this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getFullInfo(){
        StringBuilder content = new StringBuilder();
        content.append("Person\n")
                .append("\tFull Name:\t " + this.getFirstName() + " " + this.getLastName()+ "\n")
                .append("\tAge:\t\t " + this.getAge() + "\n")
                .append("\tGender:\t\t " + this.getGender() + "\n");
        return content.toString();
    }
}
