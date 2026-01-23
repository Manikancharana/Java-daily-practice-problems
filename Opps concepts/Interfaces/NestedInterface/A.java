package Interfaces.NestedInterface;

public class A {  
    //nested interface 
    public interface NestedInterface { // main interface always be public or default 
      boolean isOdd(int num);
   
    }
}
 
class B implements A.NestedInterface{  // nested interface can be public/private/protected
@Override
public boolean isOdd(int num){
    return (num &1)==1;
}
}