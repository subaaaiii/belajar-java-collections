import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    static void main() {
        Map<String, String> map = new HashMap<>();
        map.put("Eko", "Eko Value");
        map.put("Eka", "Eka Value");
        map.put("Eki", "Eki Value");

        Set<Map.Entry<String, String>> entries =  map.entrySet();
        for (var entry : entries){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }
}
