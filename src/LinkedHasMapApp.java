import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMapApp {
    static void main() {
        /**
         * gunakan jika mementingkan urutan
         * proses get data akan lebih lambat daripada map biasa
         */
        Map<String, String> map = new LinkedHashMap<>();
        map.put("first", "Eko");
        map.put("last", "Eka");
        map.put("middle", "Eki");

        Set<String> keys = map.keySet();
        for (var key: keys){
            System.out.println(key);
        }
    }
}
