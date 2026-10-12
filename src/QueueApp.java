import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    static void main() {
//        Queue <String> queue = new ArrayDeque<>();
        Queue <String> queue = new PriorityQueue<>();
        queue.add("Subairi");
        queue.add("Ahmad");
        queue.add("Zakir");
        queue.add("Bahlil");

        for (var next = queue.poll(); next !=null; next= queue.poll()){
            System.out.println(next);
        }
    }
}
