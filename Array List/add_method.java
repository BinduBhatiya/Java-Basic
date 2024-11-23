
import java.util.ArrayList;

public class add_method{
    public static void main(String []args){
        ArrayList<String> car = new ArrayList<String>();
        car.add("BMW");
        car.add("Thar");
        car.add("i20");
        car.add("BMW");
        car.trimToSize();


        System.out.println(car);        // [BMW, Thar, i20]
        System.out.println(car.size());     // 3
        System.out.println(car.indexOf("i20"));     // 2
        System.out.println(car.isEmpty());     // false
        System.out.println(car.lastIndexOf("BMW"));     // 3


    }
}