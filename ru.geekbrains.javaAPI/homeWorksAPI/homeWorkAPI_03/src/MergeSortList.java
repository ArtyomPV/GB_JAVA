import myLib.CreateIntegerArrayList;
import myLib.PrintArrayList.*;

import java.util.ArrayList;

public class MergeSortList {
    static ArrayList<Integer> numberList = null;

    public static void start() {
        numberList = CreateIntegerArrayList.createArrayList();
        System.out.println(numberList);
        mergeSortList(numberList);
        System.out.println(numberList);

    }

    private static void mergeSortList(ArrayList<Integer> numberList) {
        ArrayList<Integer> newNumberList = new ArrayList<>();
        if (numberList.size() < 2) return ;
        int middle = numberList.size() / 2;
        ArrayList<Integer> listLeft = new ArrayList<>(numberList.subList(0, middle));
        ArrayList<Integer> listRight = new ArrayList<>(numberList.subList(middle, numberList.size()));
        mergeSortList(listLeft);
        mergeSortList(listRight);
        int right = 0;
        int left = 0;
        int pos = 0;

        while (left < middle && right < numberList.size() - middle) {
            if (listLeft.get(left) < listRight.get(right)) {
                numberList.set(pos, listLeft.get(left));
                left++;
                pos++;
            } else {
                numberList.set(pos, listRight.get(right));
                right++;
                pos++;
            }
        }
        while (right < numberList.size() - middle) {
            numberList.set(pos, listRight.get(right));
            right++;
            pos++;
        }
        while (left < middle) {
            numberList.set(pos, listLeft.get(left));
            left++;
            pos++;
        }

    }
}

