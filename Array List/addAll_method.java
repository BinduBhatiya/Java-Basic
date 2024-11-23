
import java.util.ArrayList;

public class addAll_method {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(11);
        num2.add(22);
        num2.add(33);
        num2.add(44);
        num2.add(55);

        // num.addAll(num2);
        // System.out.println(num);     [10, 20, 30, 40, 50, 11, 22, 33, 44, 55]

        num.addAll(0,num2);
        System.out.println(num);        // [11, 22, 33, 44, 55, 10, 20, 30, 40, 50]
        
    }
}
