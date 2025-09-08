
import java.util.Scanner;

public class fx{
  public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("row ");
      int r=sc.nextInt();
      System.out.print("col ");
      int c=sc.nextInt();

      int findn[][]=new int[r][c];
      
      System.out.println("input");
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          findn[i][j]=sc.nextInt();
        }
      }

      System.out.println("output");
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          System.out.print(findn[i][j]+" ");
        }
        System.out.println();
      }

      System.out.println("Enter the value of x");
      int x=sc.nextInt();
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          if(findn[i][j]==x){
            System.out.print("index is "+i+","+j);
          }
        }
      }
  }
}