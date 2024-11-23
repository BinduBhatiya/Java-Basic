import java.util.ArrayList;

public class get_set_method {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Thar");
        car.add("i20");

        System.out.println(car.get(0));     // BMW
        car.set(1, "Jaguar");
        System.out.println(car);                // [BMW, Jaguar, i20]

    }
}
