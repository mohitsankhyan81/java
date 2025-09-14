class Student{
  String name;
  int rollno;
  float marks;

  Student(){
    this.name="Mohit sankhyan";
    this.rollno=435;
    this.marks=435.234f;
  }

  void greet(){
    System.out.println("My name is mohit sankhyan");
  }
  void changename(String newname){
    name=newname;
    System.out.println(newname);
  }
}

public class basic3{
  public static void main(String arg[]){
    Student karan=new Student();

    System.out.println(karan.name);
    System.out.println(karan.rollno);
    System.out.println(karan.marks);
    karan.greet();
    karan.changename("ankit sankhyan");
  }
}