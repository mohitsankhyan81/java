
import java.util.Scanner;

public class special {
  public static void main(String arg[]){
    int arr[]=new int[4];
    arr[0]=2;
    arr[1]=35;
    arr[2]=45;
    arr[3]=23;
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter the index which you want to do divide");
    int ind= sn.nextInt();
    System.out.println("Enter the value which you want to devide with");
    int number=sn.nextInt();

    try{
      System.out.println("This number which you want to devide "+arr[ind]);
      System.out.println("This is the no which devide your index no "+arr[number]);
      System.out.println("This is the result "+arr[ind]/arr[number]);
    }
    catch(Exception e){
      System.out.println("Some exxeption accors"+e);
    }
  }
}
