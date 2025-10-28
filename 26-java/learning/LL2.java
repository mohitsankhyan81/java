public class LL2{

  class Node{
    String data;
    Node next;

    Node(String data){
      this.data=data;
      this.next=null;
    }
  }

  Node head;

  public void addfirst(String data){
    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      return;
    }

    newNode.next=head;
    head=newNode;
  }

  public  void addlast(String data){
    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      return;
    }
    Node couNode=head;
    while(couNode.next != null){
      couNode=couNode.next;
    }
    corrNode.next=newNode;
  }
  public static void main(String arg[]){
    LL2 list=new LL2();
  }
}