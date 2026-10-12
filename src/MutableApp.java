import data.Person;

import java.util.List;

public class MutableApp {
    static void main() {
        Person person = new Person("Subairi");
        person.addHobby("Gym");
        person.addHobby("Running");

        doSomethingWithHobbies(person.getHobbies());
        for (var value: person.getHobbies()){
            System.out.println(value);
        }
    }
    public static void doSomethingWithHobbies(List<String> hobbies  ){
        hobbies.add("Bukan hobby");
    }
}
