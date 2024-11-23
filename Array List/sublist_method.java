import java.util.ArrayList;
import java.util.List;

public class sublist_method {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        // System.out.println(num.subList(1, 3));       [20,30]
        List<Integer> sblst = num.subList(1, 3);
        sblst.set(0, 11);
        
        System.out.println(num);        // [10, 11, 30, 40, 50]
    }
}
