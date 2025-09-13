public class resersion4 {
  public static int fact(int n){
    if(n==0){
      return 1;
    }

    return n*fact(n-1);
  }
  public static void main(String arg[]){
    int n=5;
    System.out.println(fact(n));
  }
}
