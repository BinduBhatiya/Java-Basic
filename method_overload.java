/*

What is method overloading ?
    method overloading meand method name same but different parameter in a same class it means method overloading.

*/

public class method_overload {

    static int calculate(int num1, int num2){
        return num1 + num2;
    } 
    static double  calculate(double num1, double num2){
        return num1 - num2;
    }

    public static void main(String[] args) {
        int obj_sum = calculate(10, 20);
        double obj_sub = calculate(20.2, 10.2);

        System.out.println(obj_sum);
        System.out.println(obj_sub);
    }
}
