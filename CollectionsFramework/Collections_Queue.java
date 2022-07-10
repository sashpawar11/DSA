import java.util.LinkedList;
import java.util.Queue;

public class Collections_Queue {


    // QUEUE is a FIFO data structure
    // QUEUE CAN BE IMPLEMENTED USING LINKEDLIST, ARAYLIST, PRIORITYQUEUE
    public static void main(String[] args) {

        // Implementation using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // queue.offer(element) -- to add elements to queue
        queue.offer(12);
        queue.offer(3);
        queue.offer(5);
        queue.offer(1);
        System.out.println(queue);

        // To remove element from front

        System.out.println(queue.poll());
        System.out.println(queue);

        // To return element at front
        System.out.println(queue.peek());
    }
}
