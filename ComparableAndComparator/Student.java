package ComparableAndComparator;

public class    Student implements Comparable<Student> {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        if(this.marks-s.marks != 0){
            return this.marks - s.marks;
        }
        else {
            return this.name.compareTo(s.name);
        }
    }

    @Override
    public String toString(){
        return "Student{marks = "+marks+" Name = "+ name+"}";
    }

}
