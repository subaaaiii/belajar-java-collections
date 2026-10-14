import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    static void main() {
        List<String> list = List.of("Eko", "Kurniawan", "Khannedy");
        Object[] object = list.toArray();
        String[] strings = list.toArray(new String[]{});

        System.out.println(Arrays.toString(object));
        System.out.println(Arrays.toString(strings));
    }
}
