import java.time.LocalDateTime;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println(LocalDateTime.now());
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your name: ");
//        String text = sc.nextLine();
//        System.out.println("Hello " + text + "!");
//        System.out.printf("Hello %s!", text);
        int[] array = new int[]{1, 1, 0, 1, 1, 1};
        Ex002 ex002 = new Ex002();
        System.out.println(ex002.maxCountSimmilarNumbers(array));
    }
}
