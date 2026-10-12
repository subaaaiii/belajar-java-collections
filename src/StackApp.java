import java.util.Stack;

public class StackApp {
    static void main() {
        /*
      Legacy atau kode lama,
       sudah ada fungsi deque yang lebih lengkap
 */
        Stack<String> stack = new Stack<>();
        stack.push( "Eko");
        stack.push( "Kurniawan");
        stack.push( "Khannedy");

        for(var value = stack.pop(); value != null; value = stack.pop()){
            System.out.println(value);
        }
    }
}
