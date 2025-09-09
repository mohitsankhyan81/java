public class string{
  public static void main(String arg[]){
    StringBuilder sb=new StringBuilder("Tonny");
    System.out.println(sb);

    //char at index 0
    System.out.println(sb.charAt(0));

    //set char at index
    sb.setCharAt(0,'P');
    System.out.println(sb);

    //insert
    sb.insert(0,'S');
    System.out.println(sb);

    //delete funality
    sb.delete(2,4);
    System.out.println(sb);

  }
}