/*

What is Wrapper Class in java ?
    Wrapper class is used to convert primitive data into non-primitive datatype. and convert non-primitive data into
primitive type.

Wrapper class are bridge between primitive type and objects.

Wrapper class is used to store null values.
*/

class wrapper_ex{
    public static void main(String[] args) {
        int x = Integer.parseInt("123");  // it can convert String into integer.
        System.out.println(x);

        Integer x2 = Integer.valueOf("101101",2);   // it convert binary value to integer.
        System.out.println(x2);

        Double x1 = Double.valueOf("22");  // it can convert string into double.
        System.out.println(x1);
    }
}