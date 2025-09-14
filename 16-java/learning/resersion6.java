public class resersion6 {

  public static int calcpower(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 0;
    }
    int xpower=calcpower(x, n-1);
    int pow=x*xpower;
    return pow;
  }
  public static void main(String arg[]){
    int x=2;
    int n=5;
    int ans=calcpower(x, n);
    System.out.println(ans);

  }
}
