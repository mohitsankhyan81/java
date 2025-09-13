public class resersion{

  public static void onetofiveres(int n){
    if(n==0){
      return;
    }
    System.out.print(n+" ");

    onetofiveres(n-1);
  }
  public static void main(String arg[]){
    int n=5;

    onetofiveres(n);
  }
}