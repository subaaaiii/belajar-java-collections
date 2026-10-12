import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    static void main() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Subairi");
        collection.add("Iwan");
        collection.add("Aldi");
        collection.add("Aldo");
        collection.addAll(List.of("Belajar", "Java", "Collection"));

        for(var value:collection){
            System.out.println(value);
        }
        System.out.println("REMOVE");

        collection.remove("Aldi");
        collection.remove("Aldo");

        collection.removeAll(List.of("Java", "Collection"));
        for(var value:collection){
            System.out.println(value);
        }
        System.out.println(collection.contains("Belajar"));
        System.out.println(collection.size());
    }
}
