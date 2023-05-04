package hwAPI_01;

import java.util.Scanner;

public class Ex04 {

    public static void run() {
        expression();

    }

    private static void expression() {
        System.out.println("Input expression:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] splitLine = line.replace(" ", "").split("");

        int firstNumber = Integer.parseInt(splitLine[7]) - Integer.parseInt(splitLine[4]);
        int secondNumber = Integer.parseInt(splitLine[6]) - Integer.parseInt(splitLine[0]);
        if (firstNumber < 0 || secondNumber < 0) {
            System.out.println("equation has no solution");
        } else {
            splitLine[3] = Integer.toString(firstNumber);
            splitLine[1] = Integer.toString(secondNumber);
            for (String value : splitLine) {
                System.out.print(value);
            }
        }
    }
}
