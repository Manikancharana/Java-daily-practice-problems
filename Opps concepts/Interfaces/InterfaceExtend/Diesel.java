package Interfaces.InterfaceExtend;

public interface Diesel extends Petrol { //hear, interface extends another interface 
    void diesel();
    // void electric();
  
    static void electric() {    //static interface methods should always have a body 
        System.out.println("Running on Electricity");
    }
}
