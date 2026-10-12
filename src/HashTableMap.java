import java.util.Hashtable;
import java.util.Map;

public class HashTableMap {
    static void main() {
        /*
      Legacy atau kode lama, menggunakan syncronize yang multithread safe
       namun lebih lambat
       sudah ada fungsi baru yang dapat menggantikan
 */
        Map<String, String> map = new Hashtable<>();
        map.put("Eko", "Eko");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
