import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Ivanov", 21))
                .addUser(new User("Petr", "Petrov", 25))
                .addUser(new User("Ira", "Semenova", 18))
                .addUser(new User("Artyom", "PV", 46))
                .addUser(new User("Artyom", "PV", 47));

        Personal personal2 = new Personal();
        personal2.addUser(new User("Tanya","Ivanova", 18));

        User user = new User("Lena", "Petrova" , 25);
        user.setSubordinate(personal);

        personal2.addUser(user);

        User boss = new User("Boss", "Big", 32);
        boss.setSubordinate(personal2);

        Company company = new Company(boss);
        for (User subordinates: company) {
            System.out.println(subordinates);
        }
//        for (User user: personal)
//        {
//            System.out.println(user);
//        }
//        for(int i = 0; i < personal.users.size(); i++)
//            System.out.println(personal.users.get(i));
        List<User> users = personal.toList();
        System.out.println("--------------------");
        System.out.println(users);
        System.out.println("--------------------");
        Collections.sort(users);
        System.out.println(users);


    }



}
