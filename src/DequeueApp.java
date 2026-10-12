import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueApp {
    static void main() {
        Deque <String> stack = new ArrayDeque<>();
        stack.offerLast("Eko");
        stack.offerLast("Kurniawan");
        stack.offerLast("Khannedy");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque <String> queue = new ArrayDeque<>();
        queue.offerLast("Eko");
        queue.offerLast("Kurniawan");
        queue.offerLast("Khannedy");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
