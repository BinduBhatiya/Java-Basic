/* 
 
Public Modifier :
    we can access the public modifier from another class.
    we can not declare multiple public class in our program.

*/

class firstclass{
    public String name = "Lakhu";
    public int age = 20;
}

public class modifier_public {
    public static void main(String[] args) {
        firstclass obj = new firstclass();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
