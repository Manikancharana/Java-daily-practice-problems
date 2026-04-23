import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values to print");
        int n= sc.nextInt();

        int count=0;
        int num=2;
        //  int[] arr = new int[n];

        while (count<n) {
           boolean isprime = true;
           for(int i=2; i<num/2; i++){
            if(num%i==0){
                isprime=false;
                break;
            }
           }
           if(isprime){
            System.out.print(num + " ");
            // arr[count]=num;
            count++;
           }
           num++;
        }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }
        sc.close();
    }
}