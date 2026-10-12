import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortApp {
    static void main() {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Subairi", "Eko", "Kurniawan", "Khannedy"));
        Collections.sort(list);
        for(var value : list){
            System.out.println(value);
        }
        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        Collections.sort(list, reverse);
        for(var value : list){
            System.out.println(value);
        }
    }
}
