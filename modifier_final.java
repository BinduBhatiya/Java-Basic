/*

modifier final :
    final modifier class is not extends into the child class. give second example.
    we must create the object of final class.

    final class can not inherited.
    final method can not overriden.
    final variable is immutable can not change value.

*/


final class myclass{
    protected String name = "Krishna"; 
}

public class modifier_final {
    public static void main(String[] args) {
        myclass obj = new myclass();
        System.out.println("name is : "+obj.name);
    }
}


// Second :
/* 
final class myclass{
    protected String name = "Krishna"; 
}

public class modifier_final extends myclass{   // here, throw error - cannot inherit from final myclass
    public static void main(String[] args) {
        modifier_final obj = new modifier_final();
        System.out.println("name is : "+obj.name);
    }
}

*/
