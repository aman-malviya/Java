import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        /*
         * Generics
         * If we are having multiple data types as inputs but we want to perform same set of operations on them
         * Or we want to implement a same class for different data types than it will result in a lot of code repitition.
         * 
         * That's where generics comes into play.
         * We can have a single class and use it for different data types using generics.
         */
        
        Printer<Integer> integerPrinter=new Printer<Integer>(67);
        Printer<Double>doublePrinter=new Printer<Double>(33.22);

        

        integerPrinter.print();
        doublePrinter.print();
        
        //Generics will only work with reference data types
        //Fails with primitive data types
        // Printer<int>intPrinter=new Printer<int>(34);
        //throws ERROR 


        //Another Example
        ArrayList<Integer> a=new ArrayList<>();


        // AnimalPrinter<Integer> animalPrinter=new AnimalPrinter<Integer>();
        //throws error because the datatype for class Animal printer needs to be an animal

        AnimalPrinter<Cat> catPrinter=new AnimalPrinter<Cat>(new Cat());
        AnimalPrinter<Dog> dogPrinter=new AnimalPrinter<Dog>(new Dog());
        AnimalPrinter<Animal> animalPrinter=new AnimalPrinter<Animal>(new Animal());

        catPrinter.print();
        dogPrinter.print();
        animalPrinter.print();

        //we can also have a interface followed by the class in the T section or only the interface
    }
}