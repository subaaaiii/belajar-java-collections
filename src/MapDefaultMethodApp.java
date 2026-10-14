import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    static void main() {
        Map<String,String> map = new HashMap<>();
        map.put("savio", "savio value");
        map.put("iwan", "iwan value");
        map.put("farhan", "farhan value");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+": "+value);
            }
        });
    }
}
