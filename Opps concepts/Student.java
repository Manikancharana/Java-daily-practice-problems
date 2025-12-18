import java.util.Arrays;

public class Student{
    public static void main(String[] args) {
        
    int[] rlno =new int[5];
    String[] name= new String[5];
    float[] marks = new float[5];
    Std[] students= new Std[5];
    // System.out.println(Arrays.toString(students));  // It shows null values 
   
   //one way using no-argument constructor
    Std mani = new Std();
     mani.greeting();

//    mani.rlno=28;
//    mani.name = "Kancharana";
//    mani.marks=80.8f;
//    System.out.println(mani.rlno);
//    System.out.println(mani.name);
//    System.out.println(mani.marks);

   //another way 

    // Std Aadhya = new Std(49,"Mani",98.0f);
//     System.out.println(Aadhya.rlno);
//    System.out.println(Aadhya.name);
//    System.out.println(Aadhya.marks);

   
   }
     }

 class Std{
        int rlno;
        String name;
        float marks; //= 89.9f; //default value 
 Std(){
this.rlno=28;
    this.name="Kancharana";
    this.marks=80.8f;
 }  
 
    void greeting() {
        System.out.println("My name is Mani " + name);

 }
}
  