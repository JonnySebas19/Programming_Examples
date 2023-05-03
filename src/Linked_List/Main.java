package Linked_List;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        //Create a simple 3 node linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Print all the values form this list

        //printList(head);

        //Adding a node at the end

        Node ptr = head;
        while (ptr.next != null){
            ptr = ptr.next;
        }
        // Add a new node
        ptr.next = new Node(4);

        //printList(head);

        /* Delete the node with value 2
        Travers the list until the next node has value 2
        delete the next node

        Can't change the head; Can only change 2, 3, 4
         */
        /*
        ptr = head;
        while (ptr.next != null){
            if (ptr.next.value == 2){
                // Changing the value of ptr.next but not doing anything to ptr,
                // this makes it so when we say ptr.next the next time, it will go to ptr.next.next
                // ptr.next is lost forever
                ptr.next = ptr.next.next;
            } else {
                //Moving the pointer forwards
                ptr = ptr.next;
            }
        }
        */

        //printList(head);

        // Reverse the linked list
        // print the list in reverse in one pass
        // Stack is like a stack of plates;
        // push() puts a plate on top, pop() takes a plate off the top


        // Stack with type Node
        // Stack is First In Last Out (FILO)
        Stack<Node> stack = new Stack<>();

        //traverse the linked list, and push every node onto the stack
        Node node = head;
        while (node != null){
            stack.push(node);
            node = node.next;
        }

        // Pop everything from the stack until it is empty

        while (!stack.isEmpty()){
            Node tempNode = stack.pop();
            System.out.println(tempNode.value);
        }
    }
    //Printing all the values going up
    private static void printList(Node node){
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }
}