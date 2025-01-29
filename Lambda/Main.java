package Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    record Person(String firstName, String lastName){}
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>(Arrays.asList(
                new Person("ramesh","mohan"),
                new Person("surya","prakash"),
                new Person("tenali", "rama")
        ));

        list.add(new Person("lalit","singh"));

//        list.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.lastName.compareTo(o2.lastName);
//            }
//        });

        list.sort((o1, o2) -> o2.lastName.compareTo(o1.lastName));
        System.out.println(list);

        for(Person p : list){
            System.out.println(p.firstName+' '+p.lastName);
        }

        System.out.println("-------------------");

        list.forEach(p -> System.out.println(p.firstName+' '+p.lastName));

    }
}
