/*

What is constructor overloading in java ?
     constructor overloading it means multiple constructor in a single class. all method name same as the class name.
constructor is similar to the method overloading.

*/

class Test1{
    int a;
    int b;

    Test1(int x, int y){
        a = x;
        b = y;
        System.out.println(a);
        System.out.println(b);

    }

    Test1(int y){
        b = y;
        System.out.println(b);
    }
}
public class constructor_overload {
    public static void main(String[] args) {
        Test1 obj = new Test1(10, 20);
        Test1 obj2 = new Test1(20);

    }
}
