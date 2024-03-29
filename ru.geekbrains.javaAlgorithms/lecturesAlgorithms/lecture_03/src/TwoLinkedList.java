public class TwoLinkedList {
    Node head;
    Node tail;
    public class Node{
        int value;
        Node next;
        Node previous;
    }

    public Node find(int value){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.value == value){
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return  null;
    }

    public void add(int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void add(int value, Node node){
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        newNode.previous = node;
        node.next = newNode;
        if(next == null){
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node node){
        Node previous = node.previous;
        Node next = node.next;

        if(previous == null){
            next.previous = null;
            head = next;
        } else {
            if(next == null){
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    public void revert(){
        Node currentNode = head;
        while(currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            if(previous == null){
                tail = currentNode;
            }
            if(next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        node.previous = null;
        head = node;
    }

    public Integer peek(){
        Integer result = null;
        if(tail != null){
            result = tail.value;
            tail = tail.previous;
            tail.next = null;
        }
        return result;
    }
}
