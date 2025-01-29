package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(23, "Paramveer"));
        students.add(new Student(24,"Chakraveer"));
        students.add(new Student(27,"Dharamveer"));
        students.add(new Student(18,"Karamveer"));
        students.add(new Student(13,"Ranveer"));
        students.add(new Student(33, "Balveer"));

        Collections.sort(students, (o1, o2) -> {
            if(o1.marks != o2.marks){
                return o1.marks-o2.marks;
            }
            return 0;
        });

        students.forEach(System.out::println);

    }
}
