public class Main{
    public static void main(String[] args) {
        Car car=new Car("Ferrari",2005,"White",50000.00);

        System.out.println(car);    //Prints the address of this car object
        System.out.println(car.toString()); //Will still print the address of the car object
        //Above two statements are same, in first statement the toString method in called implicitly and in the latter one it is called explicitly 

        //To print the object itself we need to over ride the toString method in Car class
    }
}