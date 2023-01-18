public class Main{
    public static void main(String[] args) {
        
        /*
         * Abstract classes can not be instantiated, but they can have sub classes or child classes.
         * Abstract methods are declared without any implementation.
         */

        // Vehicle vehicle=new Vehicle();
        //this wont work because as Vehicle class is abstract, we can't create its instance

        Car car=new Car();
        car.go();
    }
}