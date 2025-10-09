
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

public class problem1 {
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    ArrayList<Item> i=new ArrayList<>();

    try {
      File f=new File("items.txt");
      if(f.exists()){
        Scanner read=new Scanner(f);
        while(read.hasNextLine()){
          String line=read.nextLine();
          String[] data=line.split(",");
          i.add(new Item(data[0], Double.parseDouble(data[1])));
        }
        read.close();
      }
    } catch (Exception e) {
      System.out.println("FIle not readed some error acors");
    }

    System.out.println("Enter the how many student you want to store");
    int n=sn.nextInt();
    sn.nextLine();

    for(int j=0;j<n;j++){
      System.out.println("Item name is ");
      String name=sn.nextLine();

      System.out.println("Item price is ");
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
      System.out.println("Data save successfully");
    } catch (Exception e) {
      System.out.println("Error writing file: "+e.getMessage());
    }

    System.out.print("\nAll Items: ");
    for(Item item:i){
      System.out.println(item.name+" "+item.price);
    }
  }
}
