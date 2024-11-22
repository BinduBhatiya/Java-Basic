/*

What is getter & setter in java ? 
    getter method is used to get or retrive the data. whereas, setter method is used to Modify the data. 

why getter and setter ?
    in simple like pass variable in class publically we can get or set the data. but, in this case anyone can access 
    variable and pass any type of value. 
    so, with the help of getter and setter we can pass variable private so not anyone access and we can define the 
    validation. 
    get and set method provide the security. it is not possible in simple data access.

what is the difference between simple access and get_set method ?
    with the help of simple access we can not access private variable define the example below whereas if we want to
    access private variable from another class then we must use the get_set method. 

*/

class Test2{
    private int pin;
    public int getpin(){
        return pin;
    }
    public void setpin(int pin){
        if(String.valueOf(pin).length() == 4){
            this.pin = pin;
        } 
        else{
            System.out.println("only length 4 is valid. so it is Not valid pin.");
        }
    }
}
public class get_set {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.setpin(1234);
        System.out.println("Your pin is: "+obj.getpin());   // Your pin is: 1234
    }
}


/* 

class Test2{
    private int pin = 1234;
}
public class get_set {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        System.out.println("Your pin is: "+obj.pin);   // it is throw error because, we can not access private member.without get or set method. 
    }
}

*/



