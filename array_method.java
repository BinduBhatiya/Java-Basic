// compare :- compare is used to compare both array. if both are same return 0, otherwise return 1.
// fill :- fill is used to fill the array. it is work like a replace.

import java.util.Arrays;

public class array_method{
    public static void main(String []args){
        String[] arr1 = {"Ganesha", "shiva", "krishna"};
        String[] arr2 = {"Ganesha", "shiva", "krishna"};

        System.out.println(Arrays.compare(arr1,arr2));      // 0

        System.out.println(Arrays.equals(arr1,arr2));       // true

        Arrays.sort(arr1);
        for(String i:arr1){
            System.out.print(i+", ");       // Ganesha, krishna, shiva,
        }

        System.out.println(" ");

        Arrays.fill(arr2, "Vishnu");
        for(String i:arr2){
            System.out.print(i+", ");       // Vishnu, Vishnu, Vishnu,
        }

        System.out.println(" ");

        System.out.println(arr1.length);    // 3
    }
}