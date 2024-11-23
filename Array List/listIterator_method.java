
import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator_method {
    public static void main(String []args){
        ArrayList<String> student = new ArrayList<String>();
        student.add("ganesha");
        student.add("krishna");
        student.add("shivay");
        student.add("bramha");

        ListIterator<String> lit = student.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next()+", ");          // ganesha, krishna, shivay, bramha,

        }
        System.out.println(" ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous()+", ");      // bramha, shivay, krishna, ganesha,

        }

    }
}
