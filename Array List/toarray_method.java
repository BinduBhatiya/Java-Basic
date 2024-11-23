import java.util.ArrayList;

public class toarray_method {
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        Object[] carsArray = cars.toArray();
        
        for(Object item : carsArray) {
        System.out.println(item);
        }
    }
}

/* 
    Volvo
    BMW
    Ford
    Mazda
*/
