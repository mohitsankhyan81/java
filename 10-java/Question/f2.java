
import java.util.*;

//maxium minimum

public class f2{
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter the value of size ");
    int size=sn.nextInt();
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;

    int number[]= new int[size];
    for(int i=0;i<size;i++){
      number[i]=sn.nextInt();
    }
    System.out.println("Array is");
    for(int i=0;i<size;i++){
      System.out.println("Index is : "+i+" value is "+number[i]);
    }
    for(int i=0;i<number.length;i++){
      if(min>number[i]){
        min=number[i];
      }
      if(max<number[i]){
        max=number[i];
      }
    }
    System.out.println("Max term is "+max);
    System.out.print("Min termis "+min);
  }
}