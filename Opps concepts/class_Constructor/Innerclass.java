public class Innerclass {
      static class Test {
       String name;

        Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test obj =new Test("Mani");
        Test obj1 =new Test("Hari");

         System.out.println(obj.name);
         System.out.println(obj1.name);
       
    }
}


