public class E1{
  public static void average(int sum){
    int avg=sum/3;
    System.out.print("Avg is "+avg);
  }
  public static void main(String arg[]){
    int a=10;
    int b=20;
    int c=50;

    int sum=a+b+c;
    average(sum);
  }
}