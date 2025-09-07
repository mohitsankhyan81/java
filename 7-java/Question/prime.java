
import java.util.Scanner;

public class prime{

  public static int primeno(int n){
    if(n==1||n==2)return 1;
    if(n<=0)return 0;
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        return 0; 
      }
    }
    return 1;
  }
  public static void main(String arg[]){
    Scanner sn= new Scanner(System.in);
    System.out.print("enter your value of n ");
    int n=sn.nextInt();

    int fun=primeno(n);

    if(fun==1){
      System.out.println("Prime");
    }
    else{
      System.out.println("Not prime");
    }
  }
}