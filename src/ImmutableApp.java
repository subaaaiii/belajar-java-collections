import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    static void main() {
        List<String> one = Collections.singletonList("satu");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("Subairi");
        mutable.add("Iwan");
        List<String> immutable = Collections.unmodifiableList(mutable);
//        immutable.add("Joko");
        List<String> elements= List.of("Subairi", "Subai", "Bairi");
        elements.add("Joko");
    }
}
