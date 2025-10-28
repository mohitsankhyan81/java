public class LL{

  class Node{
    String data;
    Node next;

    Node(String data){
      this.data=data;
      this.next=null;
    }
  }

  Node head;


  public void addFirst(String data){
    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      return;
    }

    newNode.next=head;
    head=newNode;
  }

  public void addLast(String data){
    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      return;
    }

    Node couNode=head;
    while(couNode.next !=null){
      couNode=couNode.next;
    }
    couNode.next=newNode;
  }

  public void printdata(){
    if(head==null){
      System.out.println("This is empty");
      return;
    }
    Node couNode=head;
    while(couNode!=null){
      System.out.print(couNode.data+"->");
      couNode=couNode.next;
    }
    System.out.print("Null");
  }
  public static void main(String arg[]){
    LL list=new LL();

    list.addFirst("A");
    list.addFirst("C");
    list.addLast("B");

    list.printdata();
  }
}