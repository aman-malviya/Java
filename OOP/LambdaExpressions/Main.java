public class Main {
    public static void main(String[] args) {

        //Normal way
        Cat cat = new Cat();
        printThing(cat);

        /*
         * Functional Interface: An interface which only has one abstract method (could have other static methods or default methods).
         * 
         * Lambda Expressions will only work with Functional Interfaces.
         * 
         * A Lambda Expression is a shortcut to defining an implementation to a functional interface.
         * 
         * So, if we have a functional interface, instead of having to create a class that implements
         * that interface and then adding the implementation that we want for that one abstract method 
         * and then creating an object of that class and using it.
         * 
         * Instead, we can create a lambda expression that contains the implementation of that one abstract method in
         * the functional interface. It allows us to treat code or implementation of that abstract method as a 
         * parameter.
         * 
         * If the interface is not a functional interface i.e. it contains multiple abstract methods then we won't be
         * able to use lambda expressions as Java will not be able to decide that the lambda expression contains the 
         * implementation of which abstract method.
         * 
         * If we want to use lambda expressions with non functional interfaces then we might want to use the concept 
         * of anonymous classes.
         */

        
        //Using Lambda Expression
        printThing((suffix)->{
            System.out.println("Hello Meow"+suffix);
        });
    }

    public static void printThing(Printable thing) {
        thing.print("!!!");
    }
} 