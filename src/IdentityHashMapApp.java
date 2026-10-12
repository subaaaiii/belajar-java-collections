import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    static void main() {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 ="name.first";
        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name+dot+first;

        System.out.println(key1.equals(key2)); // ini yang digunakan di map biasa
        System.out.println(key1 == key2); //ini yang digunakan di identityhasmap

        map.put(key1, "Eko");
        map.put(key2, "Eka");

        System.out.println(map.size());
    }
}
