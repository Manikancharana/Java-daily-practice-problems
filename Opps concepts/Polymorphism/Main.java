package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes(); // reference variable is parent class but object is child class
        Shapes circle = new Circle();  // method call based on the object created
        Shapes square = new Square();  
        Triangle triangle =new Triangle();
//Polymorphism here function name 

        shape.area();
        circle.area();
        square.area();
        triangle.area();
    }
    
}
