public class getbit{
  public static void main(String arg[]){{
    int n=5;
    int pos=3;//use 3 for zero
    int bitmask=1<<pos;

    if((bitmask & n)==0){
      System.out.println("bit was zero");
    }
    else{
      System.out.println("bit was one");
    }
  }}
}