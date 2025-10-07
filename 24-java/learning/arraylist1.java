import java.util.*;

public class arraylist1 {
  public static void main(String arg[]){
    ArrayList<Integer> nums=new ArrayList<Integer>();

    nums.add(10);
    nums.add(54);
    nums.add(45);

    for(int n:nums){
      System.out.println(n);
    }
  }
}
