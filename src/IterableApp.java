import java.util.Iterator;
import java.util.List;

public class IterableApp {
    static void main() {
        Iterable<String> names = List.of("Subairi", "Iwan", "Aldi", "Aldo");

        for(var value: names){
            System.out.println(value);
        }

        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
