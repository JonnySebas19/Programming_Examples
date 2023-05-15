import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueEx {
    /*
    Queue is First In First Out (FIFO)
        - This could be a line, loading something on a computer if the sender is faster than the receiver (buffer)
        - This makes it so that we can separate different functions and decrease wait time for individual functions.
        This can be thought as

        Functions Are :
        - add(int)
        - pull()
        - peek()
        - size()

     Think of it as an array where you keep track of the beginning and end
     */
    public static void main(String[] args){
        Queue<Integer> newOrderQueue = new ConcurrentLinkedQueue<>();
    }
}
