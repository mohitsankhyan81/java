import java.util.*;
import java.io.*;
public class Exepence{
  static Scanner sn=new Scanner(System.in);
  static String File="Exepence.txt";

   static void addExepece(){
    try{
      System.out.print("Enter date (dd,mm,year): ");
      String date=sn.nextLine();
      System.out.print("Enter pro: ");
      String pro=sn.nextLine();
      System.out.print("Enter Des: ");
      String dec=sn.nextLine();
      System.out.print("Enter amount: ");
      Double amo=Double.parseDouble(sn.nextLine());

      FileWriter fw=new FileWriter(File,true);
      fw.write(date+" , "+pro+" , "+dec+" , "+amo+"\n");
      fw.close();
      System.out.println("Expence added!");
    }catch(Exception e){
      System.out.println("Some error in comming in adding expence!");
    }
   }

   static void viewExpense(){
    try{
      Scanner FileReader=new Scanner(new File(File));
      double total=0;
      while(FileReader.hasNextLine()){
        String line=FileReader.nextLine();
        System.out.println(line);
        String[] parts=line.split(" , ");
        if(parts.length==4){
          total+=Double.parseDouble(parts[3]);
        }
      }

      System.out.println("---------------");
      System.out.println("total "+total);
      FileReader.close();
    }catch(Exception e){
      System.out.println("Any error come in the viewExpense");
    }
   }

   public static void main(String arg[]){
    while(true){
      System.out.println("\n1 Add expence. \n2 view expence \n3 exit");
      System.out.println("Enter choise: ");
      String c=sn.nextLine();
      if(c.equals("1")){
        addExepece();
      }
      else if(c.equals("2")){
        viewExpense();
      }
      else{
        break;
      }
    }
   }
}