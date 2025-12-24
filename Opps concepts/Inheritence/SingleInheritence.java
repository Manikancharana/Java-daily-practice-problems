 package InheritenceTypes;

import javax.sound.sampled.SourceDataLine;

class Person{
         String name;
    void DisplyName(){
     System.out.println(" Name " + name);
    }
}

class Student extends Person{
     int rollNo ;
     void DisplyRollNo (){
        DisplyName();
        System.out.println("Roll no :" +rollNo);
     }
}

public class SingleInheritence {
public static void main(String[] args) {
       Student a = new Student();
       a.name="Mani";
       a.rollNo=28;
       a.DisplyRollNo();

}
}