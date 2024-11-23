import java.util.ArrayList;

public class clone_method {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Thar");
        car.add("i20");

        ArrayList<String> copy_car = (ArrayList)car.clone();
        System.out.println(copy_car);       // [BMW, Thar, i20]
    }
}
