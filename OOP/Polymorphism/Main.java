public class Main{
    public static void main(String[] args) {
        /*
         * Polymorphism: The ability of an object to be identified as more than one type.
         */

        Vehicle[] vehicles={new Car(), new Bike()};

        for(Vehicle v:vehicles){
            v.go();
        }
    }
}