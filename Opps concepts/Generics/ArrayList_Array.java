package Generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);

        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(100);
        linkList.add(200);
        linkList.add(300);

        System.out.println("ArrayList:"); 

        for (Integer x : arrList) {
            System.out.println(x);
        }

        System.out.println("LinkedList:");

        for (Integer x : linkList) {
            System.out.println(x);
        }

        System.out.println("Print full ArrayList at once: " + arrList);  //System.out.println(ArraList.toString()); 
        System.out.println("Print full LinkedList at once: " + linkList);  // call toString method
    }
}
