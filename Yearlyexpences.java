import java.io.*;
import java.util.*;

public class Yearlyexpences {
  static Scanner sn=new Scanner(System.in);
  static String file="yearlyexpences.txt";

  static void addexpences(){
    try{
    System.out.print("Enter data (mm,dd,year): ");
    String date=sn.nextLine();
    System.out.print("Enter item: ");
    String item=sn.nextLine();
    System.out.println("Enter discripton: ");
    String des=sn.nextLine();
    System.out.println("Enter the Amount: ");
    double amo=Double.parseDouble(sn.nextLine());


    FileWriter fw=new FileWriter(file,true);

    fw.write(date+" , "+item+" , "+des+" , "+amo+"\n");

    fw.close();

    }
    catch(Exception e){
      System.out.println("this produce errors");
    }
  }

  static void viewexpense(){
    try {
        Scanner FileReader=new Scanner(new File(file));
        double total=0;
        while(FileReader.hasNextLine()){
          String line=FileReader.nextLine();
          System.out.println(line);
          String[] parts=line.split(",");
          if(parts.length==4){
             total+=Double.parseDouble(parts[3]);
          }
        }
        System.out.println("----------------");
        System.out.println("total"+total);
        FileReader.close();
    } catch (Exception e) {
      System.out.println("the are error in the fileReader");
    }
  }

  public static void main(String[] args) {
      while(true){
        System.out.println("\n 1. Add exepence \n2. view expence \n 3. exit");
        System.out.println("Enter choise: ");
        String c=sn.nextLine();
        if(c.equals("1")){
          addexpences();
        }
        else if(c.equals("2")){
          viewexpense();
        }
        else{
          break;
        }
      }
  }
}
