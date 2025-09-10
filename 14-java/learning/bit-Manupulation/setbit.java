public class setbit{
  public static void main(String arg[]){
    int n=5;//0101
    int pos=1;
    int bitmask=1<<pos;
    int newNumber=bitmask|n;
    System.out.println(newNumber)
;  }
}