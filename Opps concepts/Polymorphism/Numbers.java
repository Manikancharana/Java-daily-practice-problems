package Polymorphism;
import java.util.Scanner;
public class Numbers {
    int Sum (int a,int b){
        return a+b;
    }
    void Sum (int a){
        String num = (a>0)? "Positive number" : "Negative number";
       System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        Numbers numr = new Numbers();
        System.out.println("Sum : "+numr.Sum(a, 30));
        numr.Sum(a);
    }
}
