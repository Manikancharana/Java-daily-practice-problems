package Interfaces.InterfaceExtend;

public class Main implements Diesel{ 
    @Override
    public void diesel(){

    }
    @Override // only implement Diesel only but petrol function also override, this is Implementing and extend.
    public void petrol(){

    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.diesel();
        obj.petrol();

        Diesel.electric(); //static methods con't overrid, accesing via cls or intreface name 
    }
}
