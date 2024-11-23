import java.util.ArrayList;

public class retainall_method {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(10);
        num2.add(20);
        
        num.retainAll(num2);

        System.out.println(num);        // [10,20]


    }
}
