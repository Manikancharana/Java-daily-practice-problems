package DSA;

// import java.lang.reflect.Array;

public class Polindrome {
    public static void main(String[] args) {     
    String string ="abccb";
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
 }
}