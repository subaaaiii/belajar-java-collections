import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    static void main() {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> single = Collections.singletonMap("Key1", "Eko");

        Map<String, String> mutable =  new HashMap<>();
        mutable.put("Key1", "Subairi");
        mutable.put("Key2", "Subairi2");
        mutable.put("Key3", "Subairi3");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
//        immutable.put("Key4", "Subairi4");  error
        Map<String, String> map = Map.of(
                "K1", "Subairi",
                "K2", "Subairi2",
                "K3", "Subairi3"
        );
        map.put("Key4", "Subairi4");

    }
}
