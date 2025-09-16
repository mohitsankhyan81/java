public class towerofhonoi{
  public static void honoitower(int n,String src,String helper,String dist){
    if(n==1){
      System.out.println("Tower Looklike " +n+" From "+src+" " +helper);
      return;
    }
    honoitower(n-1, helper, src, dist);
    System.out.println("Tower Looklike " +n+" From "+src+" " +helper);
    honoitower(n-1, src, dist, helper);
  }
  public static void main(String arg[]) {
      int n=3;
      honoitower(n, "A", "B", "C");
  }
}