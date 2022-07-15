import java.util.ArrayDeque;

public class Collections_ArrayDeque {

    // Array Deque - Double Ended Queue - can enter elements front and rear, remove front and rear, peek front and rear etc
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
         adq.offer(23);   // .offer --> add element
         adq.offer(77);
         adq.offer(57);

         adq.offerFirst(4);  // adds element at pointer pointing first
         adq.offerLast(5);  //adds element at the pointer pointing to last

        System.out.println(adq);

        System.out.println(adq.peekFirst());  // returns element at first pointer
        System.out.println(adq.peekLast());  // returns element at last pointer

        adq.poll();   // removes element from start
        System.out.println(adq);
        adq.pollFirst();  // removes element from the start end
        adq.pollLast();   // removes element from the last end
        System.out.println(adq);
    }

}
