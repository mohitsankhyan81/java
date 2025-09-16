public class towerofhonoi{
  public static void hnoioftower(int n,String src,String help,String des){
    if(n==1){
      System.out.println("Tower honi "+n+" from "+src+" to "+help);
      return;
    }
    hnoioftower(n-1, help, src, des);
    System.out.println("Tower honi "+n+" from "+src+" to "+help);
    hnoioftower(n-1, src, des, help);
  }
  public static void main(String arg[]){
    int n=3;
    hnoioftower(n, "A", "B", "C");
  }
}