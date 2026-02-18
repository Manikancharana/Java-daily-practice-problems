package Polymorphism;
import java.util.Scanner;
public class Numbers {

  int Sum (int a,int b){
        return a+b;
    }
    void Sum (int a){ // Constructor with different parameters
        String num = (a>0)? "Positive number" : "Negative number";
       System.out.println(num);
    }

    String Sum (String a , String b){ // constructor with different datatypes 
        return a+b;
    }

    public static void main(String[] args) {
        Numbers numr = new Numbers();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Sum : "+numr.Sum(a, 30));
        numr.Sum(a);

         System.out.println("Combination of to strings :"+numr.Sum("Mani","Aadhya"));
       System.out.println("Sum :"+ numr.Sum(a, 28));
        }
}

