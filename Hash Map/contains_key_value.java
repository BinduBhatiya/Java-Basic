import java.util.*;

public class contains_key_value {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.containsKey("England"));       // true
        System.out.println(capitalCities.containsValue("England"));     // false.

        capitalCities.merge("Canada", "germany", (a, b) -> a + "=" + b);
        capitalCities.merge("England", "UK", (a, b) -> a + "=" + b);
        capitalCities.merge("Canadian", "germany", (a, b) -> a + "=" + b);

        System.out.println(capitalCities);      //  {Canada=germany, USA=Washington DC, Canadian=germany, Norway=Oslo, England=London=UK, Germany=Berlin}

        capitalCities.putIfAbsent("UK", "London");
        capitalCities.putIfAbsent("USA", "America");
        capitalCities.putIfAbsent("usa", "America");

        System.out.println(capitalCities);

    }
}

/* 
 
{Canada=germany, USA=Washington DC, Canadian=germany, Norway=Oslo, England=London=UK, Germany=Berlin}

{Canada=germany, USA=Washington DC, usa=America, Canadian=germany, Norway=Oslo, UK=London, England=London=UK, Germany=Berlin}

*/
