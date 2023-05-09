package Linked_List;

public class Node<T> { // Generic
    T value;
    Node<T> next;
    public Node(){
        next = null;
    }
    public Node(T value){
        this.value = value;
    }

    public String toString(){
        return "Node{ " + "value = " + value + " }";
    }



    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node1.next.next = node3;

        while (node1 != null) {
            System.out.println(node1);
            node1 = node1.next;
        }
    }
}
