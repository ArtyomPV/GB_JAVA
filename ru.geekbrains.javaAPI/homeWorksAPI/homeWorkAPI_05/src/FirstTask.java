import java.util.HashMap;
import java.util.Scanner;

public class FirstTask {


    private HashMap<Integer, String> phoneBook = new HashMap<>();
    private String name;
    private Integer number;
    private boolean isRun = true;

    public void run() {
        do {
            System.out.println("""
                    Make a choice:
                    1  Add record
                    2  Get record
                    Q  Exit
                    """);
            Scanner in = new Scanner(System.in);
            String record = in.next();
            switch (record) {
                case "1":
                    add();
                    break;
                case "2":
                    get();
                    break;
                case "Q":
                    isRun = false;
                    in.close();
                    break;

            }
        } while (isRun);
    }

    private void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        name = sc.next();
        System.out.println("Input phone number: ");
        number = sc.nextInt();
        addRecord(name, number);
        System.out.println();
    }

    private void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        name = sc.next();
        getRecord(name);
        System.out.println();
    }

    public void addRecord(String name, Integer phoneNumber) {
        if (phoneBook.containsKey(phoneNumber)) {
            System.out.println("Запись с таким номер уже существует");
        } else {
            phoneBook.put(phoneNumber, name);
        }
    }


    //public HashMap<Integer, String> addRecord (String name, Integer phoneNumber){
//    if (phoneBook.containsKey(phoneNumber)) {
//        System.out.println("Запись с таким номер уже существует");
//        return phoneBook;
//    } else {
//        phoneBook.put(phoneNumber, name);
//    }
//    return phoneBook;
//}
//
    public void getRecord(String name) {
        if (!phoneBook.containsValue(name)) {
            System.out.println("Записи номера телефона с таким именем нет");
        } else {
            for (HashMap.Entry<Integer, String> phoneEntry : phoneBook.entrySet()) {
                if (phoneEntry.getValue().equals(name)) {
                    System.out.println(name + " " + phoneEntry.getKey());
                }
            }
        }
    }
}


