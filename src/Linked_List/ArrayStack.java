package Linked_List;

public class ArrayStack<T> implements Stack<T>{
    T[] data;
    int capacity; // Max number of elements allowed in the stack
    int size; // Number of elements in the stack
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        data = (T[]) (new Object[capacity]);
        size = 0;
    }

    @Override
    public void push(T value) {
        //Use the end of the array

        //TODO:Error check; make sure the array is not full
        data[size] = value;
        size++;
    }

    @Override
    public T pop() {
        //TODO:Error check; make sure the array is not Empty
        T ret = data[size - 1];
        size--; // "deleting" the last element of the array
        return ret;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
