import java.util.List;
import java.util.Vector;

public class VectorApp {
    static void main() {
/*
      Legacy atau kode lama, menggunakan syncronize yang multithread safe
       namun lebih lambat
       sudah ada fungsi baru yang dapat menggantikan
 */
        List<String> list = new Vector<>();
        list.add("Eko");
        list.add("Kurniawan");
        list.add("Khannedy");

        for (var value : list){
            System.out.println(value);
        }
    }
}
