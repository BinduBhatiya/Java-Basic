/*

What is method overriding ?
    method overriding it means method name same, parameter same but in different class.

    in method overiding in different class method name same and number of parameter same but, name of arguments
    are different. it is not matter in overriding.

    in method overriding method name same in different class so if we can call the child class then it will return 
    the child class method but not call the parent class method. so, we need to use the "SUPER" keyword. it can fetch 
    the parent class method in child class.

*/

class myclass1{
    public void myfunc1(int a){
        System.out.println("a = "+ a);
    }
}
class myclass2 extends myclass1{
    @Override
    public void myfunc1(int a){
        System.out.println("myclass2 a = "+ a);
    }
}
public class method_override {
    public static void main(String[] args) {
        myclass2 obj = new myclass2();
        myclass1 obj2 = new myclass1();
        obj.myfunc1(10);
        obj2.myfunc1(10);
    }
}


//  second example.


// class Shape{
//     double area;
//     void calculateArea(double dimension1, double dimension2){
//         area = dimension1 * dimension2 ;
//         System.out.println("area of parent is : " + area);
//     }
// }
// class Rectangle extends Shape{
//     @Override
//     void calculateArea(double length, double width){
//         super.calculateArea(length, width);
//         double rect = length * width;
//         System.out.println("child rectangle area : " + rect);
//     }
// }
// public class method_override {
//     public static void main(String[] args) {
//         Rectangle obj = new Rectangle();
//         obj.calculateArea(10, 20);
//     }
// }


