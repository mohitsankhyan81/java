
import java.util.ArrayList;
import java.util.Scanner;

class student{
  String name;
  int age;
  double marks;

    public student(String name,int age,double marks) {
      this.name=name;
      this.age=age;
      this.marks=marks;
    }

    void display(){
      System.out.println("Name is "+name+" Age is "+age+" marks is "+marks);
    }

  
}

public class arraylistThisOne {
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    ArrayList<student> list=new ArrayList<>();

    System.out.println("Enter no of students: ");

    int n=sn.nextInt();
    sn.nextLine();

    for(int i=0;i<n;i++){
      System.out.println("\nEnter Student details "+(i+1)+" : ");

      System.out.println("Name : ");
      String name=sn.nextLine();

      System.out.println("Age : ");
      int age=sn.nextInt();

      System.out.println("marks : ");
      double marks=sn.nextDouble();

      sn.nextLine();
      list.add(new student(name, age, marks));
    }

    System.out.println("==Array list details==");
    for (student s:list){
      s.display();
    }
    sn.close();
  }
}
