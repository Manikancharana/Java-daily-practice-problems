package Practice;
import java.util.Arrays;
public class SecMax {
    // method 1
//     public static void secmaximum(int [] arr){
//        int n= arr.length;
//        for(int i=0; i<n-1; i++){
//         boolean swapped= false;
//         for(int j=0; j<n-1-i; j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1] = temp;
//                 swapped = true;
//             }
//         }
//         if(!swapped){
//             break;
//         }
//        }
//     }

//    public static void main(String[] args){
//         int [] arr = {5,2,6,4,7,8,3};
//         secmaximum(arr);
//         int n= arr.length;
//         System.out.println("Second maximum element is " + arr[n-2]);
//         System.out.println("Third maximum element is " + arr[n-3]);

//     }




// method 2 (best method) two variable method 
//    public static void main(String[] args){
//     int [] arr = {5,6,1,8,7,6,2,9};
//     int max=Integer.MIN_VALUE;
//     int secmax= Integer.MIN_VALUE;   
//     for(int num: arr){
//         if(num>max){
//             secmax= max;
//             max= num;
//         }
//         else if(num>secmax && num!= max){
//             secmax=num;

//         }
//     }
//     System.out.println("Second maximum is " + secmax);
// }






// method 3 
public static void main(String[] args){
    int [] arr = {5,7,65,2,4,33,58,6,1};
    int n=arr.length;
    Arrays.sort(arr);
    System.out.println("Secondmax is "+ arr[n-2]);
}
}
