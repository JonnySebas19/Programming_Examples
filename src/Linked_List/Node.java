package Linked_List;

public class Node<T> { // Generic
    T value;
    Node<T> next;
    public Node(){}
    public Node(T value){
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
