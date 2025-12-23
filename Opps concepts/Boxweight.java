public class Boxweight extends Box {
    Double weight;

    Boxweight(){
        this.weight=-1d;
    }
    Boxweight (Double l,Double w, Double h , Double weight){
        super(l,w,h); // call parent class constructor 
        // used values need to intilize in parent class 
        this.weight = weight;
    }
}

