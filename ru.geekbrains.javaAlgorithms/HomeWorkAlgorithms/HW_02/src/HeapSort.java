public class HeapSort {
    public static void sort(int[] array){
        for(int i = array.length/2 - 1; i >=0; i--) {
            heapify(array, array.length, i);
        }
            // Один за другим извлекаются элементы из кучи
            for(int i = array.length/2 ; i >=0; i--){
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                // вызываем heapify на уменьшенной куче
                heapify(array, i, 0);
            }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if(leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }
        if(rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }
        // если самый большой элемент не корень
        if(largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            // рекурсивно преобразуем в двоичную кучу затронутые поддеревья
            heapify(array, heapSize, largest);
        }
    }
}
