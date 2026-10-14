import collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    static void main() {
        Queue<String> queue = new SingleQueue<>();
        System.out.println(queue.size());
        System.out.println(queue.offer("Subairi"));
        System.out.println(queue.offer("Subairi2"));
        System.out.println(queue.offer("Subairi3"));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }
}
