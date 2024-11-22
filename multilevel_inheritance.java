/* 
 
What is multilevel inheritance ?
    in simple term child class is the parent class of another child class.

*/

class multiclass{
    public void myfunc(){
        System.out.println("hello myfunc.");
    }
}
class multiclass2 extends multiclass{
    public void myfunc2(){
        System.out.println("hello myfunc2.");
    }
}
class multiclass3 extends multiclass2{
    public void myfunc3(){
        System.out.println("hello myfunc3.");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        multiclass3 obj = new multiclass3();
        obj.myfunc();
        obj.myfunc2();
        obj.myfunc3();
    }
}
