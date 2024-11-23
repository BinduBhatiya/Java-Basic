import java.util.ArrayList;

public class replaceall_method {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("BMW");
        car.add("Thar");
        car.add("i20");
        car.add("BMW");

        car.replaceAll((n) -> (n + " car"));
        System.out.println(car);                // [BMW car, Thar car, i20 car, BMW car]
    }
}
