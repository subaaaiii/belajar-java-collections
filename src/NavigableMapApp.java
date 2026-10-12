import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    static void main() {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("Eko", "Eko");
        map.put("ABA", "ABA");
        map.put("ZAHRA", "ZAHRA");

        for (var value: map.keySet()){
            System.out.println(map.get(value));
        }

        System.out.println(map.lowerKey("ZAHRA")); // sebelum zahra
        System.out.println(map.higherKey("Eko")); // setelah eko

        NavigableMap<String, String> descMap = map.descendingMap();
        for (var value: descMap.keySet()){
            System.out.println(map.get(value));
        }

        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);
//        immutable.put("Eka", "Eka"); error
    }
}
