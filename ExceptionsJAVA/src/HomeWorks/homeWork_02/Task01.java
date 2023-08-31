package HomeWorks.homeWork_02;

import java.util.Scanner;

public class Task01 {
    public static void run() {
        float number;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while(!flag){
            System.out.println("input number:");
            String value = sc.nextLine();
            try{
                number = Float.parseFloat(value);
                flag = true;
                System.out.println(number);
            } catch (NumberFormatException e){
                System.out.println("не верный ввод данных!");
            }
        }
    }
}
