public class Main{
    public static void main(String[] args) {
        /*
         * Encapsulation
         * Attributes of a class will be hidden or private.
         * The can be accessed only through methods (getters and setters).
         * You should make attributes private if you don't have a good enough reason to make them public or protected.
         */

        Car car=new Car("BMW","Black",2006);

        // System.out.println(car.name);
        //This wont work because name attribute is private anc cant be accessed directly
        //We can have a getter method for this

        System.out.println(car.getName());

        //We can also have setters 
        car.setYear(2009);

        System.out.println(car.getYear());
    }
}