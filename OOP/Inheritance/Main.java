public class Main{
    public static void main(String[] args) {

        /*
         * Java does not support multiple inheritance.
         */
        Car car=new Car();
        car.go();

        Bicycle bike=new Bicycle();
        bike.stop();
    }
}