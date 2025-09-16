public class revstring{
  public static void rev(String str,int idx){
    if(idx==0){
      System.out.println(str.charAt(idx));
      return;
    }
    System.out.println(str.charAt(idx));
    rev(str, idx-1);
  }
  public static void main(String args[]) {
      String str="abcd";
      rev(str, str.length()-1);
  }
}