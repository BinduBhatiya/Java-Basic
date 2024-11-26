
import java.util.HashMap;

public class compute_method {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // anyone from both
        capitalCities.compute("England", (k,v) -> v + "(" + k + ")");   // {USA=Washington DC, Norway=Oslo, England=London(England), Germany=Berlin}
        capitalCities.compute("land", (k,v) -> v + "(" + k + ")");      // {USA=Washington DC, Norway=Oslo, England=London, land=null(land), Germany=Berlin}

        System.out.println(capitalCities);      // {USA=Washington DC, Norway=Oslo, England=London(England), land=null(land), Germany=Berlin}

        capitalCities.replace("England", "UK");
        capitalCities.replace("England", "german");

        System.out.println(capitalCities);      // {USA=Washington DC, Norway=Oslo, England=german, land=null(land), Germany=Berlin}

        capitalCities.replaceAll((k,v) -> "The capital of" + k + " is " + v);       //  {USA=The capital ofUSA is Washington DC, Norway=The capital ofNorway is Oslo, England=The capital ofEngland is german, land=The capital ofland is null(land), Germany=The capital ofGermany is Berlin}
        System.out.println(capitalCities);
    }
}
