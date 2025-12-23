
public class Box {
    Double l;
    Double w;
    Double h;

    Box(){
        this.l=-1d;
        this.w=-1d;
        this.h=-1d;
    }
    //cube
    Box(Double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    Box(Double l, Double w, Double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
   Box(Box old){
    this.l = old.l;
    this.w = old.w;
    this.h = old.h;

   }
   public void info(){
    System.out.println("Running box");
   }
}
