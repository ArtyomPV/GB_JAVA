import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = null;
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(10);
        list.add(7);
        list.add(6);

//        MergeSort mergeSort = new MergeSort();
//        mergeSort.start();
        MergeSortList.start();
//        System.out.println(list.subList(0, 3));
//        ArrayList<Integer> list2 = new ArrayList<>(list.subList(0, 3));
//        System.out.println(list2);
//        System.out.println(SecondTask.removeEven(list));
//        ThirdTask.start();
    }
}