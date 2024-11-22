/* 
 
What is single inheritance ?
    single inheritance means only single child class inherit all the property of single parent class.

    java support 4 type of inheritance.
    1. single inheritance
    2. multilevel inheritance
    3. hierarchical inheritance
    4. hybrid inheritance (using interface)

    multiple inheritance does not support.

    Oops :-

        1. class - object
        2. inheritance --> single, multi-level, hieararchical, hybrid
        3. polymorphism --> method overloading, method overriding
        4. data abstraction --> interface( "multiple inherit" ), abstract class
        5. encapsulations --> getter, setter (private variable access).

*/

class parent{
    protected int a = 10;
    protected int b = 20;
    public void myfunc(){
        System.out.println("a = "+a);
    }
}
class child extends parent{
    public void myfunc2(){
        int c = a + b;
        System.out.println("sum is: " + c);
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        child obj = new child();
        obj.myfunc();      // a = 10
        obj.myfunc2();       // sum is = 30
    }
}
