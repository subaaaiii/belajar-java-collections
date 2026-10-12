import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    static void main() {
        SortedMap<String, String> map = new TreeMap<>();
        map.put("Eko", "Eko");
        map.put("ABA", "ABA");
        map.put("ZAHRA", "ZAHRA");

        for (var value: map.keySet()){
            System.out.println(map.get(value));
        }

        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(map);
//        immutable.put("Citra", "Citra"); // error

    }
}
