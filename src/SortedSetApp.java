import data.Person;
import data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    static void main() {
//        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("Subairi"));
        people.add(new Person("Iwan"));
        people.add(new Person("Agus"));
        people.add(new Person("Zahri"));

        for (var value:people){
            System.out.println(value.getName());
        }

        SortedSet<Person> sortedset = Collections.unmodifiableSortedSet(people);
        sortedset.add(new Person("Sudu"));
    }
}
