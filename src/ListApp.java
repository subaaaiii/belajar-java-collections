import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

    static void main() {
        List <String> names = new ArrayList<>();
//        List <String> names = new LinkedList<>();

        names.add("Subairi");
        names.add("Iwan");
        names.add("Aldi");

        names.remove(1);
        names.set(0,   "Budi");
        System.out.println();

    }
}
