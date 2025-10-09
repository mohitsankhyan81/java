
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class studentdetail{
  String name;
  int age;

  public studentdetail(String n,int a){
    name=n;
    age =a;
  }

  public String toString(){
    return name+" "+age;
  }
}

public class student1 {
  public static void main(String arg[]){
    ArrayList<studentdetail> student=new ArrayList<>();

    Scanner sn=new Scanner(System.in);

    System.out.println("How many number of data you want to store");

    int n=sn.nextInt();
    sn.nextLine();

    for(int i=0;i<n;i++){
      System.out.println("Name is ");
      String name =sn.nextLine();
      System.out.println("Age is ");
      int age=sn.nextInt();
      sn.nextLine();

      student.add(new studentdetail(name, age));
    }

    try {
        FileWriter fw=new FileWriter("student1.txt");
        for(studentdetail s:student){
          fw.write(s.toString()+'\n');
        }
        fw.close();
        System.out.println("This file already exist");
    } catch (IOException e) {
      e.printStackTrace();
    }
    sn.close();

  }
}
