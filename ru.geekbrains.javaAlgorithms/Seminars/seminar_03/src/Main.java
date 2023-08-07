public class Main {
    public static void main(String[] args) {
        MyLinkedList<Employee> myLinkedList = new MyLinkedList<>();
        Employee employee1 = new Employee("AAA", 25);
        Employee employee2 = new Employee("BBB", 25);
        Employee employee3 = new Employee("DD", 17);
        Employee employee4 = new Employee("DD", 32);
        Employee employee5 = new Employee("BBB", 31);
        Employee employee6 = new Employee("CC", 19);
        myLinkedList.addFirst(employee1);
        myLinkedList.addFirst(employee3);
        myLinkedList.addFirst(employee2);
        myLinkedList.addFirst(employee4);
        myLinkedList.addFirst(employee5);
        myLinkedList.addFirst(employee6);

         System.out.println(myLinkedList);
         myLinkedList.sort(new EmployeeComparator());
         System.out.println(myLinkedList);

         // разворот myLinkedList
         myLinkedList.revert();

         System.out.println(myLinkedList);
    }
}