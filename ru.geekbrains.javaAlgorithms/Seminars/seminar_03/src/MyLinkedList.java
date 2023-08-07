import java.util.Comparator;

public class MyLinkedList<T> {
    private Node head;

    class Node {
        public Node next;
        public T value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while(node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }

    /**
     * добавление элемента в начало списка
     *
     * @param value новео значение
     */
    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    /**
     * Удаление первого элемента списка
     */
    public void firstRemove() {
        if (head != null) {
            head = head.next;
        }

    }

    public T contains(T value) {
        Node node = head;
        while (node.next != null) {
            if (node.value.equals(value)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    /**     * Сортировка выбором
     */
    public void sort(Comparator <T> comparator){
        Node node = head;
        while(node.next != null){
            Node minValueNode = node;
            Node nextNode = node.next;
            while(nextNode != null){
                if(comparator.compare(minValueNode.value, nextNode.value) >0){
                    minValueNode = nextNode;
                }
                nextNode = nextNode.next;
            }
            if(minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }
            node = node.next;
        }
    }

    public void removeLast(){
        if(head == null){
            return;
        }
        Node node = head;
        while (node.next != null){
            if(node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }
}

