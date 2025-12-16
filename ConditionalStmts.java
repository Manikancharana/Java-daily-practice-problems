import java.util.Scanner;
public class ConditionalStmts {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter your Bill amount.");
     int amount=sc.nextInt();
     if(amount>1000){
        System.out.println("Offer valid!....");
     }
     else{
        System.out.println("Offer not valid!");
     }
  sc.close();
    }
}
