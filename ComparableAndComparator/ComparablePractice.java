package ComparableAndComparator;

import java.util.*;
public class ComparablePractice {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(34,"Pakki"));
        list.add(new Student(23,"Jagga"));
        list.add(new Student(70,"Shera"));
        list.add(new Student(70,"Kalu"));
        list.add(new Student(65,"Baljit"));

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
