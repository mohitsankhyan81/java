
import java.util.Scanner;

// Print sum of first n natural Numbers.

public class Que1 {
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter the value of N ");
    int n=sn.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    System.out.println(sum);
  }
}
