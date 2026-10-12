import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    static void main() {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Eko");
        Set<String> mutable = new HashSet<>();
        mutable.add("EKO");
        mutable.add("KURNIAWAN");
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        immutable.add("Yanti"); //tidak bisa

        Set<String> set = Set.of("SUBAIRI", "EKO");
        set.add("eka"); //tidak bisa
        set.remove("SUBAIRI"); //TIDAK BISA

    }
}
