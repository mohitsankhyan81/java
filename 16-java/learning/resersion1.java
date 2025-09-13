public class resersion1 {

  public static void onetofive (int n){
    if(n==6){
      return;
    }
    System.out.print(n+" ");
    onetofive(n+1);
  }
  public static void main(String arg[]){
    int n=1;
    onetofive(n);
  }
}
