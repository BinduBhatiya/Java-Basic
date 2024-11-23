
import java.util.ArrayList;

public class foreach_method{
    public static void main(String []args){
        ArrayList<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Thar");
        car.add("i20");

        car.forEach( (n) -> {System.out.print(n+", ");} );      // BMW, Thar, i20
    
    }
}