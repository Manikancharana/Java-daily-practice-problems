package Generics;

import java.util.Arrays;

public class CustomArrayList{
    private int[] data;
    private int size =0;
    private static int DEFAULT_SIZE=3;


   public CustomArrayList(){
    this.data= new int[DEFAULT_SIZE];
   }

   public void add(int num){
    if(isfull()){
        resize();
    }
    data[size++]=num;
   }

   public boolean isfull(){
    return size == data.length; 
   }

   public void resize(){
    int [] temp = new int[data.length *2];   // Double the arraylist

    for(int i=0; i<data.length;i++){
        temp[i]=data[i];   // Copy data 
    }
    data=temp;    
   }
     public int remove(){
        int removed = data[--size];  //Decresing the size not deleting items, even deleting size arralist shows old values
        // data[size]=0;   //This is delelting elements in an Arraylist
        return removed;
        
     }

    public int getSize() { 
        return size;
    }

    public int getCapacity() { 
        return data.length;
    }


    @Override
  public String toString(){
    return "CustomArrayList{" + "data" + Arrays.toString(data) + ", size " +size + "}";
  }


   public static void main(String[] args) {
    CustomArrayList obj = new CustomArrayList();

    obj.add(25);
    obj.add(250);
    obj.add(2);
    obj.add(5);   // Double the arraylist size
    obj.add(205);  
    obj.add(56); 
    obj.add(45);
    obj.add(78);
    obj.remove(); 
    obj.remove();
    obj.remove();
    obj.remove(); 
    obj.remove();
    obj.remove();

    System.out.println("ArrayaList size is "+obj.getSize());
    System.out.println("ArrayaList capacity is "+obj.getCapacity());
    System.out.println(obj);  


   }

}