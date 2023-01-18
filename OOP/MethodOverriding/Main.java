public class Main{
    public static void main(String[] args) {

        /*
         * Method Overriding: Declaring a method in child class which is already present in the parent class
         *                    so that the child class can have its own implementation of that method.
         */
        Dog dog=new Dog();
        dog.speak();

        Animal dogo=new Animal();
        dogo.speak();
    }
}