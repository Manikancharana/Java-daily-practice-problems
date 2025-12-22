package DSA;

import javax.sound.sampled.SourceDataLine; 

public class Main {
    public static void main(String[] args) {
        Human mani= new Human(22,"Mani","Male",60000); // Object creation and accesign from Human class
        Human Hari= new Human(28,"Hari","Male",80000);
        Human Kavya= new Human(20,"Kavya","Female",40000);


        System.out.println(mani.name);
        System.out.println(Hari.salary);

        System.out.println(Human.population); // Accessing static variable using class name
   
        //Main.greet(); // Error: non-static method greet() cannot be referenced from a static context
        Conference(); // static method can be called directly in static context
       Main obj =new Main();
        obj.greet();

      Main obj2 =new Main();
      obj2.welcome();        
        
    }
  
   static void Conference () {
    System.out.println("Welcome to the conference");
   }

    void greet(){ // non-static method Object required to call non-static method
        Conference(); // static method can be called directly in non-static method
        System.out.println("Hello Mani");
    }

    void welcome(){
        greet();  // Once created object no need to create another object to call in another method
        System.out.println("Welcome to the event");
    }
   
}
 