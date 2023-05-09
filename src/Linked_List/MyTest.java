package Linked_List;

public class MyTest {
    public static void main(String[] args){
        LinkedStack<Integer> myStack1 = new LinkedStack<>();
        ArrayStack<Integer> myStack2 = new ArrayStack<>(100);

        //pushAndPop(myStack1);
        //pushAndPop(myStack2);

        pushInts(myStack1);
        myStack1.reverse();
        pop(myStack1);

        pushInts(myStack1);
        myStack1.reverseRecursive();
        pop(myStack1);


        System.out.println("End of code");
    }

    private static void pushAndPop(Stack<Integer> myStack) {
        for (int i = 0; i < 8; i++){
            myStack.push(i);
        }

        while (!myStack.isEmpty()){
            Integer val = myStack.pop();
            System.out.println(val);
        }
    }
    private static void pushInts(Stack<Integer> myStack){
        for (int i = 0; i < 8; i++){
            myStack.push(i);
        }
    }

    private static void pop(Stack<Integer> myStack){
        while (!myStack.isEmpty()){
            Integer val = myStack.pop();
            System.out.println(val);
        }
    }
}
