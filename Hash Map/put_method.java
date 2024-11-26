import java.util.HashMap;

public class put_method {
    public static void main(String[] args) {
        HashMap<String, String> car = new HashMap<>();
        car.put("punjab", "Thar");
        car.put("gujarat", "fortuner");
        car.put("mumbai", "jaguar");

        System.out.println(car);        //  {punjab=Thar, mumbai=jaguar, gujarat=fortuner}

        System.out.println(" ");

        car.forEach((k,v) -> {System.out.println(k + "->" + v);});

        System.out.println(car.entrySet());     // [punjab=Thar, mumbai=jaguar, gujarat=fortuner]

        System.out.println(car.getOrDefault("punjab", "unknown"));      // Thar
        System.out.println(car.getOrDefault("canada", "unknown"));      // unknown

        System.out.println(car.isEmpty());      // false

        car.clear();

        System.out.println(car.isEmpty());      // true

        System.out.println(car);        //  {}
    }
}


/* 
 
{punjab=Thar, mumbai=jaguar, gujarat=fortuner}

punjab->Thar
mumbai->jaguar
gujarat->fortuner

[punjab=Thar, mumbai=jaguar, gujarat=fortuner]

Thar
unknown

{}

*/
