import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author ArtyomPV
 */
public class ThirdTask {
    public static void start(){
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner in  = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = in.nextInt();
        in.close();
        for (int i = 0; i < n; i++) {
            numberList.add((int) Math.floor(Math.random()*100));
        }
        System.out.println("Array: ");
        printArray(numberList);
        System.out.println("Find max:");
        System.out.println(findMax(numberList));
        System.out.println("Find min:");
        System.out.println(findMin(numberList));
        System.out.println("Find overage:");
        System.out.println(findAverage(numberList));
    }

    private static void printArray(ArrayList<Integer> array){
        System.out.println(array);
    }

    private static int findMax(ArrayList<Integer> array){
        int max;
        max = Collections.max(array);
        return max;
    }
    private static int findMin(ArrayList<Integer> array){
        if(array.size() != 0) {
            int min;
            min = Collections.min(array);
            return min;
        }
        System.out.println("List is empty");
        return 0;
    }
    private static double findAverage(ArrayList<Integer> array){
        double sum = 0;
        if(array.size() != 0) {
            for (double value : array) {
                sum += value;
            }
            return sum / array.size();
        }
        System.out.println("List is empty");
        return 0;
    }
}

