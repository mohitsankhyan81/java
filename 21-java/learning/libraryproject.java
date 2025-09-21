
import java.util.Scanner;

class library{
  private String[] avilablebook;
  private String[] issuebook;
  private int avilablecount;
  private int issuecount;


  public library(int size){
    avilablebook = new String[size];
    issuebook=new String[size];
    avilablecount=0;
    issuecount=0;
  }

  public void addbook(String book){
    avilablebook[avilablecount]=book;
    avilablecount++;
    System.out.println(book+" Book is added");
  }


  public void showavilablebook(){
    System.out.println("\nAvilable books");
    if(avilablecount==0){
      System.out.println("No book in library");
    }
    else{
      for(int i=0;i<avilablecount;i++){
        System.out.println((i+1) + ". "+ avilablebook[i]);
      }
    }
  }

  public void issuebook(String book){
    boolean found=false;
    for(int i=0;i<avilablecount;i++){
      if(avilablebook[i].equals(book)){
        issuebook[issuecount]=book;
        issuecount++;
        avilablebook[i]=avilablebook[avilablecount-1];
        avilablecount--;
        found=true;
        System.out.println(book+"has been issued");
        break;
      }
    }
    if(!found){
      System.out.print("Book not found");
    }
  }

  public void returnbook(String book){
    boolean found=false;
    for(int i=0;i<issuecount;i++){
      if(issuebook[i].equals(book)){
        avilablebook[avilablecount]=book;
        avilablecount++;
        issuebook[i]=issuebook[issuecount-1];
        issuecount--;
        found=true;
        System.out.println(book+" has been return");
        break;
      }
    }
    if(!found){
      System.out.println("This book is not from this library");
    }
  }

  public void showissuedbooks(){
    System.out.println("\nIssuebooks");
    if(issuecount==0){
      System.out.println("No book issue");
    }
    else{
      for(int i=0;i<issuecount;i++){
        System.out.println((i+1)+". "+ issuebook[i]);
      }
    }
  }
}


public class libraryproject{
  public static void main(String arg[]){
    library l=new library(500);
    Scanner sn=new Scanner(System.in);

    while(true){
      System.out.println("1. Add book");
      System.out.println("2. Show avilable book");
      System.out.println("3. issue book");
      System.out.println("4. return book");
      System.out.println("5. show issued books");
      System.out.println("6. Exit");

      System.out.print("which functionality you want ");
      int ch=sn.nextInt();
      sn.nextLine();
      if(ch==1){
        System.out.println("Enter book name ");
        l.addbook(sn.nextLine());
      }
      else if(ch==2){
        l.showavilablebook();
      }
      else if(ch==3){
        System.out.println("Enter book name");
        l.issuebook(sn.nextLine());
      }
      else if(ch==4){
        System.out.println("Enter book name");
        l.returnbook(sn.nextLine());
      }
      else if(ch==5){
        l.showissuedbooks();
      }
      else{
        System.out.println("Exit...");
        break;
      }
    }
    sn.close();
  }
}