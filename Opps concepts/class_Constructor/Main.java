public class Main {
    public static void main(String[] args) {
        // Box box =new Box(33.9,43.28,16.09);
        // Box box1 = new Box (box);
        // // System.out.println(box1.l + "\n"+ box1.w + "\n" +box1.h);

        // Boxweight box2 = new Boxweight( 23.3,31.10,25.26,43.28);
        // System.out.println(box2.h  + /* "\n" + box2.l + */  "\n" + box2.w + "\n" + box2.weight); 

        // Box box3 =new Boxweight();  
        // System.out.println(box3.w+ "\n" + box3.weight);
        // here we can access the w value but con't weight value via box3 object, box3 reference to the Box class 
        // we can access values in super()


       Boxweight box4 =new Boxweight();  //Box con't acces the Boxweight properties
       box4.setA(280);
      System.out.println("Getter method..."+box4.getA());
    }
}
