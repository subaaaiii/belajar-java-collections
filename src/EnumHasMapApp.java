import java.util.EnumMap;
import java.util.Map;


public class EnumHasMapApp {
    public static enum Level{
        FREE, MEDIUM, PREMIUM, VIP
    }
    static void main() {
        Map<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Eko");
        map.put(Level.PREMIUM, "Eka");
        map.put(Level.VIP, "Eki");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
