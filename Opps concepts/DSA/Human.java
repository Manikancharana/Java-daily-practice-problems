package DSA;

public class Human {// Blueprint  
    int age;
    String name;
    String gender;
    int salary;
    static long population; // static variable belongs to class not to object

   Human (int age,String name, String gender, int salary) { // Parameterized constructor 
        this.age=age;
        this.name=name;
        this.gender= gender;
        this.salary=salary;
        Human.population++; // Incrementing population whenever an object is created  
        //this.population++; this Not used for static variable it is used for instance variable
    }

    static void info(){ // static method
        System.out.println(Human.population); // Accessing static variable using class name
       // System.out.println(this.age); // it's shows error beacause  age is instence variable
    }
}
