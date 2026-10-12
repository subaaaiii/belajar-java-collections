import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    static void main() {
//        Set <String> set = new HashSet<>(); // tidak berurutan
        Set <String> set = new LinkedHashSet<>(); // berurutan
        set.add("Eko");
        set.add("Kurniawan");
        set.add("Khannedy");

        for (var value: set){
            System.out.println(value);
        }
    }
}
