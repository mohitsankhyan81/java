
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


class Item{
  String itemname;
  int price;

  public Item(String i,int p){
    itemname=i;
    price=p;
  }

  public String toString(){
    return itemname+" "+price;
  }
}

public class product {
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    ArrayList<Item> i=new ArrayList<>();

    try{
      File f=new File("practice.txt");
      if(f.exists()){
        Scanner read=new Scanner(f);
        while(read.hasNextLine()){
          String line=read.nextLine();
          String data[]=line.split(",");
          i.add(new Item(data[0], Double.parseDouble(data[1])));
        }
        
      }
      read.close();
    }catch(IOexeption e){

    }
  }
}
