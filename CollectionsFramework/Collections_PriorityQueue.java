import java.util.Comparator;
import java.util.PriorityQueue;

public class Collections_PriorityQueue {

    /* PRIORITY QUEUE - BASICALLY A QUEUE, WHERE WE CAN DEFINE PRIORITIES FOR ELEMENTS. EG- IN A QUEUE THERE MIGHT BE A PRESIDENT WHO NEEDS TO GET OUT OF THE QUEUE
     FIRST, SO WE GIVE PRIORITY TO THE PRESIDENT. */

    // USED TO IMPLEMENT MINHEAP, MAXHEAP ETC.

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();  // implements minHeap by Default
        /*       2
                /  \
               5   32     MinHeap
              /
             52
         */

        pq.offer(32);
        pq.offer(2);
        pq.offer(5);
        pq.offer(52);
        System.out.println(pq);   // implements minHeap --> takes the smallest element and sorts accordingly


        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());


        // To implement maxHeap;
        PriorityQueue<Integer>pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(32);
        pq2.offer(2);
        pq2.offer(5);
        pq2.offer(52);
        System.out.println(pq2);

    }
}
