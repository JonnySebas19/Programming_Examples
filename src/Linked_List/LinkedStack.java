package Linked_List;

public class LinkedStack<T> implements Stack<T>{
    Node<T> head;
    int size = 0;
    public LinkedStack(){
        head = new Node<>(); // Creating a dummy Node
    }
    @Override
    public void push(T value){
        size++;

        Node<T> newNode = new Node<>(value);
        newNode.next = head.next;
        head.next = newNode;
    }
    @Override
    public T pop(){

        size--;
        T ret = head.next.value;
        head.next = head.next.next;
        return ret;
    }
    @Override
    public boolean isEmpty(){

        if (size == 0){
            return true;
        }
        return false;
    }
}
