import java.util.ArrayList;

public class clear_method {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Thar");
        car.add("i20");

        System.out.println(car);        // [BMW, Thar, i20]
        car.clear();
        System.out.println(car);        // []

    }
}
