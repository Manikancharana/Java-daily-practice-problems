package InheritenceTypes;
    class Animal{       
    void sound(){
        System.out.println("Animals make sound");
    }
}
  class Dog extends Animal {
    void sound (){
      System.out.println("Dogs : Bowwww");
    }
  }
  class Cat extends Animal {
    void sound(){
        System.out.println("Cats : Meeowwwww ");
    }
  }
  public class Hierarchial {
  public static void main(String[] args) {
    Animal obj;
    obj = new Dog();
    obj.sound();
    obj = new Cat();
    obj.sound();
}
  }
