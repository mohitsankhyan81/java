import java.util.*;
public class Linkedlist {
  public static void main(String arg[]){
  LinkedList<String>list=new LinkedList<String>();

  list.addFirst("A");
  list.addFirst("B");
  System.out.println(list);

  list.addLast("This");
  list.add("Last");
  System.out.println(list);

  System.out.println(list.size());


  for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" -> ");
  }
  System.out.println("null");
  }
}
