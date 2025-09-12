

class Student{
  int rno;
  String name;
  float marks;
}

public class basic2{
  public static void main(String agr[]){
    Student kunal=new Student();

    kunal.rno=34;
    kunal.name="mohit sankhyan";
    kunal.marks=435.45f;


    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);

  }
}