public class OneLinkedList {
    Node head;
    public class Node{
        int value;
        Node next;
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
        }
    }


}
