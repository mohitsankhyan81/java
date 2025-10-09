
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class studentdetail{
  String name;
  int age;

  public studentdetail(String n,int a){
    name=n;
    age=a;
  }

  public String toString(){
    return name+" "+age;
  }
}

public class paractice1 {
  public static void main(String arg[]){
    ArrayList<studentdetail> studnet=new ArrayList<>();

    Scanner sn=new Scanner(System.in);

    System.out.println("How many no of student data you want to store");
    int n=sn.nextInt();
    sn.nextLine();

    for(int i=0;i<n;i++){
      System.out.println("Name is ");
      String name=sn.nextLine();

      System.out.println("Age is ");
      int age =sn.nextInt();

      sn.nextLine();

      studnet.add(new studentdetail(name, age));
    }

    try{
      FileWriter fw=new FileWriter("paractice.txt");
      for(studentdetail s:studnet){
        fw.write(s.toString()+"\n");
      }
      fw.close();
      System.out.println("This file is already exist");
    }catch(IOException e){
      e.printStackTrace();
    }

    sn.close();
  }
}
