class Student{
  int rln;
  String name;
  float marks;

  Student(int a,String b,float c){
    rln=a;
    name=b;
    marks=c;
  }
}

public class basis4{
  public static void main(String arg[]){
    Student kunal = new Student(10,"Mohit sankhyan",546.356f);
    

    System.out.println(kunal.rln);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);
  }
}