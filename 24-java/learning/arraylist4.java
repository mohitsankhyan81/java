import java.util.ArrayList;

public class arraylist4 {
  public static void main(String arg[]){
    ArrayList<String> fruit=new ArrayList<>();
    
    fruit.add("Mango");
    fruit.add("Banana");
    fruit.add("Orange");
    
    System.out.println(fruit);
    fruit.remove(1);
    fruit.set(1,"Cherry");
    System.out.println(fruit.get(1));

    System.out.println(fruit);
    System.out.println("Size= "+fruit.size());
  }
}
