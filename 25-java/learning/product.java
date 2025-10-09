//only read file not give any output so not expext any output from this code 

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Item{
  String name;
  double price;

  Item(String name,double price){
    this.name=name;
    this.price=price;
  }

  public String toString(){
    return name+" "+price;
  }
}
public class product{
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    ArrayList<Item>i=new ArrayList<>();

    try {
        File f=new File("item.txt");
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
      System.out.println("Fle read error");
    }
  }
}