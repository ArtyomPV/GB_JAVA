package hwAPI_01;

import java.util.Scanner;

public class Ex01 {
    public static int inputSize(){
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        if(sc.hasNextInt()){
            size = sc.nextInt();
        }  else {
            System.out.println("It is not number!");
        }
        return size;
    }
    public static int threeangleNumber(int size){
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += i;
        }
        return result;
    }
    public static int factorial(int size){
        int result = 1;
        for (int i = 1; i < size; i++) {
            result *= i;
        }
        return result;
    }
    public static void run(){
        int size = inputSize();
        System.out.printf("Threeangle number %d\n", threeangleNumber(size));
        System.out.printf("factorial number %d\n", factorial(size));
    }
}
