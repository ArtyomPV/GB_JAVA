package myLib;

import java.util.ArrayList;
import java.util.Scanner;

public interface CreateIntegerArrayList {

    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = in.nextInt();
        in.close();
        for (int i = 0; i < n; i++) {
            numberList.add((int) Math.floor(Math.random() * 100));
        }
        return numberList;
    }
}
