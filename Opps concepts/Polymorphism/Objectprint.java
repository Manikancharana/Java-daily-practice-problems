package Polymorphism;

public class Objectprint {
    int num;

    Objectprint(int num){
        this.num = num;
    }
    public static void main(String[] args) {
        Objectprint obj = new Objectprint(52);
        System.out.println(obj); // prints default object value i.e class name @ hashCode....
    }
}
