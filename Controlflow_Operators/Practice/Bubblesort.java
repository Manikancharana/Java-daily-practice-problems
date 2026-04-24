package Practice;
public class Bubblesort {
    // // public static void bubblesort(int[] arr){
    // void bubblesort(int[] arr){
    //     int n = arr.length;
    //     for(int i=0; i<n-1; i++){
    //         boolean swapped= false;

    //         for(int j=0;j<n-1-i; j++){
    //              if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j]= arr[j+1];
    //                 arr[j+1] = temp;
    //                  swapped = true;
    //              }
    //         }
    //         if(!swapped){
    //             break;
    //         }
    //     }
    // }
    //     public static void main(String[] args){
    //         int [] arr = {6,4,7,3,5};
    //         Bubblesort obj= new Bubblesort();
    //        obj.bubblesort(arr);

    //     //    bubblesort(arr);

    //         System.out.println("Sorted array is ");

    //         for(int i:arr){
    //             System.out.print(i + " ");
    //       }
    // }


public static void bubblesort(int[] arr){
    int n = arr.length;
    for(int i=0; i<n-1; i++){
    boolean swapped=false;
        for(int j=0; j<n-1-i; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             swapped=true;
          }

        }
        if(!swapped){
            break;
        }

    }
}
public static void main(String[] args){
    int [] arr = {5,4,9,1,7};
    bubblesort(arr);
    System.out.println(" Sorted array is : ");
    for(int i :arr){
      System.out.print(i);
    }

}
}


