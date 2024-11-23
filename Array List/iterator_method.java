
import java.util.ArrayList;
import java.util.Iterator;

public class iterator_method {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("berry");
        fruits.add("cherry");
        fruits.add("orange");

        Iterator<String> it = fruits.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

/* 
    apple
    banana
    berry
    cherry
    orange
*/
