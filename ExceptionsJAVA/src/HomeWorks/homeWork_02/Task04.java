package HomeWorks.homeWork_02;

import java.util.Scanner;

public class Task04 {
    public static void run()  {
        System.out.println("Input value:");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        try {
            checkStringValue(value);
        } catch (MyNullStringException e) {
            System.out.println(e.getMessage());;
        }
    }
    public static void checkStringValue(String value) throws MyNullStringException {
        if(value==""){
            throw new MyNullStringException("Введена пустая строка", value);
        }
    }
    abstract static class  MyException extends Exception{
        private final String value;

        public MyException(String message, String value) {
            super(message);
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    static class MyNullStringException extends MyException{

        public MyNullStringException(String message, String value) {
            super(message, value);
        }
    }




}
