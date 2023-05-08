import java.util.Random;
import java.util.Scanner;


/**
 * @author ArtyomPV
 */
public class MergeSort {

    int[] array;
    int[] value = new int[3];
    String[] requests = new String[]{"Введите длину массива: ",
            "Введите минимальное значение элемента массива: ",
            "Введите максимальное значение элемента массива: "};

    /**
     * Конструктор класса
     */
    MergeSort() {
//        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(requests[i]);
            if (sc.hasNextInt()) {
//                assert value != null;
                value[i] = sc.nextInt();
            } else {
                System.out.println("Необходимо ввести число!");
            }
        }
    }

    /**
     * Функция, которая создает рандомный массив
     *
     * @return Возвращает массив с рандомными элементами
     */
    public int[] createArray() {
        Random random = new Random();
        array = new int[value[0]];
        for (int i = 0; i < value[0]; i++) {
            array[i] = (int) random.nextInt(value[1], value[2]);
        }
        return array;
    }

    /**
     * Функция сортирует массив методом слияния
     *
     * @param array несортированный массив
     */
    public void mergeArrays(int[] array) {
        if (array.length < 2) {
            return;
        }
        int middle = array.length / 2;
        int[] arrayLeft = new int[middle];
        int[] arrayRight = new int[array.length - middle];
        System.arraycopy(array, 0, arrayLeft, 0, middle);
        if (array.length - middle >= 0)
            System.arraycopy(array, middle, arrayRight, 0, array.length - middle);
        mergeArrays(arrayLeft);
        mergeArrays(arrayRight);

        int right = 0, left = 0, pos = 0;
        while (left < middle && right < array.length - middle) {
            if (arrayLeft[left] < arrayRight[right]) {
                array[pos] = arrayLeft[left];
                left++;
            } else {
                array[pos] = arrayRight[right];
                right++;
            }
            pos++;
        }
        while (right < (array.length - middle)) {
            array[pos] = arrayRight[right];
            right++;
            pos++;
        }
        while (left < middle) {
            array[pos] = arrayLeft[left];
            left++;
            pos++;
        }
    }

    /**
     * Выводит в консоль элементы массива
     *
     * @param array массив
     */
    public void showArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public void start() {
        int[] array = createArray();
        showArray(array);
        mergeArrays(array);
        showArray(array);
    }
}
/*
Реализовать алгоритм сортировки слиянием
 */

