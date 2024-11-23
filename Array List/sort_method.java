import java.util.ArrayList;

public class sort_method {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.sort(null);
        // System.out.println(cars);         [BMW, Ford, Mazda, Volvo]

        cars.sort( (a, b) -> { return -1 * a.compareTo(b); } );
        System.out.println(cars);           // [Volvo, Mazda, Ford, BMW]
    }
}


