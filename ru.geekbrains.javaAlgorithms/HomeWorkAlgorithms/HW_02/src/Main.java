import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 6, 3, 7, 4, 8, 5, 1};
        HeapSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}