
import java.util.ArrayList;

class Student{
  String name;
  int marks;

    public Student(String n ,int m) {
      name=n;
      marks=m;
    }

}

public class arraylistinclass {
  public static void main(String arg[]){
    ArrayList<Student> students=new ArrayList<Student>();

    students.add(new Student("Mohit", 434));
    students.add(new Student("Rohit",45));
    for(Student s:students){
      System.out.println(s.name+" _ "+s.marks);
    }
  }
}
