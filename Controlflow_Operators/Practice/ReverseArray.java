package Practice;

public class ReverseArray {
    public static void  main (String[] args){
        int arr[] = {5,6,2,8,7,3,6};
        int end = arr.length-1;
        int start = 0;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
             start++;
             end--;
        }
        System.out.println("Reversed array is ");
        for(int i :arr){
            System.out.print(i + " ");
        }
    }
}
