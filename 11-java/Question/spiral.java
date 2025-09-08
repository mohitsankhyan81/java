
import java.util.Scanner;

public class spiral{

  public static void sprialmatrix(int a[][],int r,int c){
    int top=0;
    int bootam=r-1;
    int left=0;
    int right=c-1;

    while(top<=bootam&&left<=right){
      for(int i=left;i<=right;i++){
        System.out.print(a[top][i]+" ");
      }
      top++;
      for(int i=top;i<=bootam;i++){
        System.out.print(a[i][right]+" ");
      }
      right--;
      if(top<=bootam){
        for(int i=right;i>=left;i--){
          System.out.print(a[bootam][i]+" ");
        }
        bootam--;
      }
      if(left<=right){
        for(int i=bootam;i>=top;i--){
          System.out.print(a[i][left]+" ");
        }
        left++;
      }
    }
  }
  public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("row");
    int r=sc.nextInt();
    System.out.print("col");
    int c=sc.nextInt();

    int a[][]=new int[r][c];
    System.out.println("Input");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]= sc.nextInt();
      }
    }
    sprialmatrix(a,r,c);
  }
}