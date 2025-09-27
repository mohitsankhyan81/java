abstract class pen{
  abstract void write();
  abstract void refill();
}

class Foundationpen extends pen{
  void write(){
    System.out.println("write");
  }
  void refill(){
    System.out.println("refill");
  }
  void changenip(){
    System.out.println("Change the nip");
  }
}

class monkey{
  void jump(){
    System.out.println("jump..");
  }
  void bite(){
    System.out.println("Bite..");
  }
}

  interface BasicAnimal{
    void eat();
    void sleap();
  }
class human extends monkey implements BasicAnimal{
  void speak(){
    System.out.println("Hello sir!");
  }
  public void eat(){
    System.out.println("Eating food");
  }
  public void sleap(){
    System.out.println("Monkey sleap");
  }
}
public class abstracting {
  public static void main(String arg[]){
    Foundationpen pen=new Foundationpen();
    pen.changenip();

    human h=new human();
    h.bite();
    h.eat();
    h.sleap();
    h.jump();
    h.speak();


    monkey m1=new human();
    m1.bite();
    m1.jump();

    
    BasicAnimal lovish =new human();
    lovish.eat();
    lovish.sleap();
  }
}
