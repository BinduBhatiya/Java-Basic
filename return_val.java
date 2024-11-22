/*

in java we can return value if method is not void. if we can declare the void method then it throw error.

*/

public class return_val {
    static int  myfunc(int num1, int num2){
        return num1 + num2;
    }  
    public static void main(String[] args) {
        int myvar = myfunc(10, 20);
        System.out.println(myvar);
    }
}
