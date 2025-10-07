import java.util.ArrayList;

public class arraylist5 {
  public static void main(String arg[]){
    ArrayList<Integer> num=new ArrayList<>();

    num.add(34);
    num.add(45);
    num.add(54);
    
    for(int n:num){
      System.out.println(n);
    }
  }
}
