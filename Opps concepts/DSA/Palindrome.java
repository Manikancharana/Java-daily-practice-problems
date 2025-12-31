package DSA;
// package menas folders

public class Palindrome {
    public static void checkPalindrome() {     
    String string ="abcdeedcba";
    int start =0;
    int end=string.length()-1;

    // System.out.println(end);
     boolean ispolindrome=true;
    while (start<end){
        if(string.charAt(start)!=string.charAt(end)){
        ispolindrome= false;
        break;
        }
        start++;
        end--;
    }
    System.out.println(ispolindrome? "Ispolindrome ":"Is not a polidrome" );
 } // access in Sorting array
}