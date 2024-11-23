
import java.util.ArrayList;

public class ensure_capacity_method {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.ensureCapacity(10);
        for (int i = 1; i <= 30; i++) {
           num.add(i);          //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
        }
        System.out.println(num);
    }
}
