
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Studentdetail{
  String name;
  int age;

    public Studentdetail(String n,int a) {
      name=n;
      age=a;
    }

    public String toString(){
      return name+" "+age;
    }

  
}

public class student{
  public static void main(String arg[]){
    ArrayList<Studentdetail> students=new ArrayList<>();

    Scanner sn=new Scanner(System.in);
    System.out.println("Enter who many data of student you store now");
    int n=sn.nextInt();
    sn.nextLine();
    for(int i=0;i<n;i++){
      System.out.println("Studnet Name ");
      String name=sn.nextLine();
      System.out.println("Student Age ");
      int age=sn.nextInt();

      sn.nextLine();

      students.add(new Studentdetail(name, age));
    }

    try {
        FileWriter fw=new FileWriter("studnet.txt");
        for(Studentdetail s:students){
          fw.write(s.toString()+"\n");
        }
        fw.close();
        System.out.println("data store in studnet");
    } catch (Exception e) {
      e.printStackTrace();
    }

    sn.close();
  }
}