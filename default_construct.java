/*
 
What is Default Constructor ?
    which constructor not take any parameter it is called Default Constructor.

*/


class Test{
    int a = 10; // instance variable
    Test(){     // Default Constructor

        int b = 20;  // local variable
        System.out.println(a);
        System.out.println(b);

        System.out.println("Jai Lakhu maa.");
    }
}

public class default_construct {

    public static void main(String[] args) {
        Test obj = new Test();  // here, we do not need to call the constructor method.
    }
  
}

