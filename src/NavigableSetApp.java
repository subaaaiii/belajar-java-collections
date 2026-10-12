import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    static void main() {
        NavigableSet <String> names = new TreeSet<>();
        names.addAll(Set.of("Subairi", "Duh", "Mamat", "Akang", "Wawan"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> sampeMamatIkut = names.headSet("Mamat", true);
        NavigableSet<String> sampeMamat = names.headSet("Mamat", false);
        NavigableSet<String> dariMamatIkut = names.tailSet("Mamat", true);

        for(var name: sampeMamat){
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("Sariki");
    }
}
