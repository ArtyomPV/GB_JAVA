import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


/**
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на экран
 */
public class FirstTask {
    public static void start(){
        ArrayList<Integer> list = null;
        ArrayList<Double> doubleArrayList = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of list: ");
        int n = in.nextInt();
        in.close();
        list = fillList(n);
        doubleArrayList = fillListDouble(n);
        printList(doubleArrayList);
        printList(list);
//        sortList(list);
        collectionsSort(list);
        printList(list);
    }

    private static void collectionsSort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
    private static ArrayList<Double> fillListDouble(int n) {
        ArrayList<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            doubleList.add(Math.floor(Math.random()*10000)/100);
        }
        return doubleList;
    }
    private static ArrayList<Integer> fillList(int n) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            numberList.add(rand.nextInt(25));
        }
        return numberList;
    }

    private static void printList(ArrayList list) {
        System.out.println(list);
        }
//    private static void printList(ArrayList<Integer> list) {
//        System.out.println(list);
//    }


    private static ArrayList<Integer> sortList(ArrayList<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if(list.get(i) > list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }

        }
return  list;
    }


}
