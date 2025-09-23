public class nextedcatch{
  public static void main(String arg[]){
    int[] marks=new int[4];
    marks[0]=45;
    marks[1]=56;
    marks[2]=63;
    boolean flag=true;
    while(flag){
    try{
      System.out.println("Welcome to the coding");
      try{
        System.out.println(marks[2]);
        flag=false;
      }
      catch(ArrayIndexOutOfBoundsException
         e){
          System.out.println("This index in not found");
      }
    }
    catch(Exception e){
      System.out.println("Exception in level 1");
    }
  }
  }
}