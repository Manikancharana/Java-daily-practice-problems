public class Main {
    public static void main(String[] args) {
        Box box =new Box(33.9,43.28,16.09);
        Box box1 = new Box (box);
        // System.out.println(box1.l + "\n"+ box1.w + "\n" +box1.h);

        Boxweight box2 = new Boxweight( 23.3,31.10,25.26,43.28);
        System.out.println(box2.h  + "\n" + box2.l + "\n" + box2.w + "\n" + box2.weight);
    }
}
