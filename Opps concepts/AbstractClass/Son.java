package AbstractClass;

public class Son extends Parent{

    @Override
    void career(String name) {
    System.out.println("I love "+name);
    }
    @Override
    void patner(String name , int age){
        System.out.println(name+" is bestfrienc" + "He is" +age);
    }
}
