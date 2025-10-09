import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Item{
  String name;
  Double price;

  Item(String n,Double p){
    name=n;
    price=p;
  }

  public String toString(){
    return name+" "+price;
  }
}

public class product1 {
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    ArrayList<Item> i=new ArrayList<>();

    try{
      File f=new File("item.txt");
      if(f.exists()){
        Scanner read=new Scanner(f);
        while(read.hasNextLine()){
          String line=read.nextLine();
          String data[]=line.split(",");
          i.add(new Item(data[0], Double.parseDouble(data[1])));
        }
      }
    }
    catch(Exception e){
      System.out.println("Some error in file System or code");
    } 


    System.out.println("How many student you want to store");
    int n=sn.nextInt();
    sn.nextLine();

    for(int j=0;j<n;j++){
      System.out.println("name is ");
      String name=sn.nextLine();

      System.out.println("price is ");
      Double price=sn.nextDouble();
      sn.nextLine();

      i.add(new Item(name, price));
    }

    try {
        FileWriter fw=new FileWriter("items.txt",true);
        for(Item item:i){
          fw.write(item.toString()+"\n");

        }
        fw.close();
        System.out.println("Data saved successfully!");
    } catch (Exception e) {
      System.out.println("Error writing file: "+e.getMessage());
    }

    System.out.println("\nAll Items:");
    for(Item items:i){
      System.out.println(items.name+" - & "+items.price);
    }
  }
}
