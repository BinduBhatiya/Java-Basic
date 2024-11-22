/* 
 
What is interface ?
    we can implement the data abstraction in two way. 
    1. abstract class
    2. interface

    interface is used to hiding the implementation detail to the users.

Why interface ?
    java does not support multiple inheritance so, when we need to use multiple inheritance then we use the interface.

*/

interface myinterface{
    public void myfunc1();
}
interface myinterface2{
    public void myfunc2();
}
class myclassex implements myinterface,myinterface2{
    @Override
    public void myfunc1(){
        System.out.println("hello my world.");
    }
    @Override
    public void myfunc2(){
        System.out.println("hello my world function2.");
    }
}
public class interface_ex {
    public static void main(String[] args) {
        myclassex obj = new myclassex();
        obj.myfunc1();
        obj.myfunc2();
    }
}
