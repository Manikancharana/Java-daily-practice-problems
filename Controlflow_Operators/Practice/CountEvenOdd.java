package Practice;

public class CountEvenOdd {
    public static void main(String [] args){
    int arr [] = {1,5,6,4,9,8,7,3,65,56,45};
    int n= arr.length;
    int count=0;
    int num=0;
    for(int i=0;i<n-1;i++){
        if(arr[i]%2==0){
            count++;
        }
        else{
            num++;
        }
    }
    System.out.println("Even are "+count+ "  Odd are "+ num);
}
}