/* 
 
Public Modifier :
    we can access the protected modifier from another class.

*/

class firstclass1{
    protected  String name = "Lakhu";
    protected  int age = 20;
}

public class modifier_protected {
    public static void main(String[] args) {
        firstclass1 obj = new firstclass1();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
