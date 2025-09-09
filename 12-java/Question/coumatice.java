
import java.util.Scanner;

public class coumatice{
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter size ");
    int size=sn.nextInt();
    String array[]=new String[size];
    int tolength=0;

    for(int i=0;i<size;i++){
      array[i]=sn.next();
      tolength+=array[i].length();
    }

    System.out.print(tolength);
  }
}