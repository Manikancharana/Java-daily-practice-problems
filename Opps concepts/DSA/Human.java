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
    }
}
