package Linked_List;

public class Node { // Generic
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }

    public static class Main {
        public static void main(String[] args) {
            Node node1 = new Node(1);
        }
    }
    public String toString(){
        return "Node{ " + "value = " + value + " }";
    }
}
