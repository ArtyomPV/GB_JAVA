package hwAPI_01;

import hwAPI_01.Ex01;

public class Ex02 {
    public static String simpleNumber(int size){
        for (int i = 2; i < size; i++) {
            if(size%i == 0){
                return "The number is not simple";
            }
        }
        return "The number is simple";
    }
    public static void printSimpleNumber(int size){
        boolean flag = true;
        for (int i = 1; i < size; i++) {
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
        if(flag){
            System.out.print(i + " ");
        }
        flag = true;
        }
    }
    public static void run(){
        int size = Ex01.inputSize();
        System.out.println(simpleNumber(size));
        printSimpleNumber(size);
    }
}
