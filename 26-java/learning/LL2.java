public class LL2 {
  private int size;
    LL2(){
      this.size=0;
    }
  class Node{
    String data;
    Node next;

    Node(String data){
      this.data=data;
      this.next=null;
      size++;
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

    Node currNode=head;

    while(currNode.next!=null){
      currNode=currNode.next;
    }
    currNode.next=newNode;
  };

  public void deleteFirst(){
    if(head==null){
      System.out.println("This is empty");
      return;
    }
    size--;
    head=head.next;
  }

  public void deleteLast(){
    if(head==null){
      System.out.println("This is empty");
      return;
    }
    size--;
    if(head.next==null){
      head=null;
      return;
    }

    Node secNode=head;
    Node lastNode=head.next;

    while(lastNode !=null){
      lastNode=lastNode.next;
      secNode=secNode.next;
    }
    secNode.next=null;
  }

  public void printNode(String data){
    if(head==null){
      System.out.println("This is Empty");
      return;
    }

    Node currNode=head;

    while(currNode!=null){
      System.out.print(currNode.next+"->");
    }
    System.out.println("This is null");
  }

  public int getsize(){
    return size;
  }
  public static void main(String arg[]){
    LL list=new LL();
    list.addFirst("A");
    list.addFirst("C");
    list.addLast("B");
    list.addFirst("F");
    list.deleteFirst();
    list.deleteLast();
    list.printNode();

    System.out.println(list.getsize());
  }
}
