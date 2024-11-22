/*
 
What is parameterized Constructor ?
    which constructor take the parameter it is called parameterized Constructor.

 */

class Test{
    int a = 10;     // instance variable
    int b = 20;     // instance variable

    Test(int x, int y){     // parameterized constuctor that take two parameter.
        x = a;
        y = b;

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);

        int z = x + y;
        System.out.println("Sum is: "+ z);
    }
}
public  class parameterized_construct{
    public static void main(String[] args) {
        Test obj = new Test(10,20);
    }
 }