// simple use of if-else in static method.

public class param_if_else {
    static void myfunc(int age){
        if(age > 18){
            System.out.println("you are valid for give Vote.");
        }
        else{
            System.out.println("you are Not valid for give Vote.");
        }
    } 
    public static void main(String[] args) {
        myfunc(20);
    }
}
