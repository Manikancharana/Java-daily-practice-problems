public class Boxweight extends Box {
    Double weight;
    private int a;
    void setA(int a){
        this.a=a;
    }
    int getA(){
        return a;
    }

    Boxweight(){
        this.weight=-1d;
    }
    Boxweight (Double l,Double w, Double h , Double weight){
        super(l,w,h); // call parent class constructor 
         // when the super class not used then the default constructor will call from the parent class
        // used values need to intilize in parent class 
        this.weight = weight;
    }
}

