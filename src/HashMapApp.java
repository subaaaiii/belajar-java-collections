import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    static void main() {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Eko");
        map.put("name.middle", "Kurniawan");
        map.put("name.last", "Khannedy");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
