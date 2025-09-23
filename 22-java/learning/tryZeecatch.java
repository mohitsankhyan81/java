public class tryZeecatch {
  public static void main(String arg[]){
    int a=6000;
    int b=0;
    try {
      int c=a/b;
      System.out.println(c);
    } catch (Exception e) {
      System.out.println("We fail to divide. Reson: ");
      System.out.println(e);
    }
    System.out.println("Ent of the program");
  }
}
