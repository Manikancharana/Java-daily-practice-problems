package AbstractClass;

public  class Daughter extends Parent{

    @Override
    void career(String name) {
    System.out.println("I love "+name);
    }
    @Override
    void patner(String name , int age){
        System.out.println(name+" is my closefriend" + " & She is" +age);
    }
}
