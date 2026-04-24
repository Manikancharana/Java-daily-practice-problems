package Practice;

public class Sortedarray {
    public static void main(String[] args){
    int [] arr = {1,2,3,6,7};
    int n = arr.length;
    boolean sorted = true;
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
         sorted= false;
         break;
        }
    }
    System.out.println(sorted);
      
}
}