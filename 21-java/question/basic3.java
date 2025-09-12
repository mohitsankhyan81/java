
  class student{
    int rno;
    String name;
    float marks;

    student(){
      this.rno=45;
      this.name="mohit sankhyan";
      this.marks=4534.34f;
    }

    void greeting(){
      System.out.println("Thanks for love and sport");
    }

    void Changename(String newName ){
      name=newName;
      System.out.println(newName);
    }
  }
  public class basic3{
  public static void main(String arg[]){
    student kunal=new student();

    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);
    kunal.greeting();
    kunal.Changename("Mohit sankhyan pro");

  }
}