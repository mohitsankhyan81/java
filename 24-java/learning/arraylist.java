
import java.util.ArrayList;

public class arraylist {
  public static void main(String arg[]){
    ArrayList<String> fruite=new ArrayList<String>();

    fruite.add("Apple");
    fruite.add("Banana");
    fruite.add("Cherry");

    System.out.println(fruite);
    System.out.println(fruite.get(1));

    fruite.set(1,"Mango");
    fruite.remove("Cherry");

    System.out.println(fruite);
    System.out.println("Size: "+fruite.size());
  }
}
