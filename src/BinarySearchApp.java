import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    static void main() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=1000 ; i++) {
            list.add(i);
        }
        int index = Collections.binarySearch(list,339);
        System.out.println(index);

        Comparator<Integer> reverse = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, reverse);


        int indexWithComparator = Collections.binarySearch(list,339, reverse);
        System.out.println(indexWithComparator);


    }
}
