public class p5{
  public static void main(String arg[]){
    int n=4;
    //inverted and roted peramid
    for(int i=1;i<=n;i++){
      //inner loop for print the spaces
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
    System.out.println();
    }
  }
}