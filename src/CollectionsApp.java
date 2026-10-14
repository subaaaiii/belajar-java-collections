import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    static void main() {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Eko", "Kurniawan", "Khannedy", "Programmer","Zaman", "Now"));

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
