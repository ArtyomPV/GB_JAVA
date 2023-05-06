public class Task2 {

    public static int[] bubbleSort(int[] array){
        int tempValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i]>array[j]){
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }

        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                System.out.print(array[i]);
            } else  System.out.print(array[i] +  ", ");
        }{

        }
    }
}
