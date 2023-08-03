public class myLinkedList<T> {
    private Node head;

    class Node {
        public Node next;
        public T value;
    }

    /**
     * добавление элемента в начало списка
     *
     * @param value новео значение
     */
    public void firstNode(T value) {
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
}
