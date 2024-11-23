import java.util.HashMap;

public class put_method {
    public static void main(String[] args) {
        HashMap<String, String> car = new HashMap<String, String>();
        car.put("punjab", "Thar");
        car.put("gujarat", "fortuner");
        car.put("mumbai", "jaguar");

        System.out.println(car);        //  {punjab=Thar, mumbai=jaguar, gujarat=fortuner}

        car.clear();
        System.out.println(car);        //  {}
    }
}
