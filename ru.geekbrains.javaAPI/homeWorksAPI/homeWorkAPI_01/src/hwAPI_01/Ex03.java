package hwAPI_01;

import java.util.Scanner;

public class Ex03 {
    public static int firstNumber;
    public static int secondNumber;
    public static String arithmeticAction;

    public static void run() {
        do {
            firstNumber = Integer.parseInt(inputValue("Input first number: "));
            arithmeticAction = inputValue("Input action: ");
            secondNumber = Integer.parseInt(inputValue("Input second number: "));
            action(firstNumber, secondNumber, arithmeticAction);
        } while (inputValue("\nContinue... y/n").equals("y"));


    }

    private static String inputValue(String text) {
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void action(int firstNumber, int secondNumber, String arithmeticAction) {
        switch (arithmeticAction) {
            case "+":
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.printf("%d / %d = %d", firstNumber, secondNumber, firstNumber / secondNumber);
                    break;
                } else {
                    System.out.println("Division by zero is not possible");
                }
        }
    }
}
