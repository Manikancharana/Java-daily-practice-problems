public class Staticblock {
    static int a= 5;
     static int b;

    static{
        b=a*5;
    }
    public static void main(String[] args) {
    //   Staticblock obj = new Staticblock(); // no need to create object to access static block 
        System.out.println(b);
    }
}
