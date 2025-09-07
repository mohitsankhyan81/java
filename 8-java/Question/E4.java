
import java.util.Scanner;

public class E4{
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n=sn.nextInt();

    int a=0,b=1;
    System.out.print("Fabbonic secqurece: ");
    for(int i=1;i<=n;i++){
      System.out.print(a+" ");
      int c=a+b;
      a=b;
      b=c;
    }
  }
}