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
    // One way to reverse the nodes using placeholders
    public void reverse(){
        Node curr = head.next;
        Node prev = null;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // curr == null
        // prev must be at the end
        head.next = prev;
    }
    //TODO
    public ListNode reverseRecursive(ListNode node){
        Node curr = head.next;
        Node prev = null;
        Node next = null;

        if (node != null){

        }
    }
}
