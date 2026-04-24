package Practice;

public class Encapsulation {
    private int marks;

    void setmarks(int m){
        marks=m;
    }
    int getmarks(){
        return marks;
    }

    public static void main(String[] args){
        Encapsulation sc = new Encapsulation();
        sc.setmarks(56);
        System.out.println(" marks are : "+ sc.getmarks());

    }
}
