import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*
         * Dynamic Polymorphism: Runtime Polymorphism
         */

        Animal animal;
        Scanner scanner=new Scanner(System.in);

        System.out.println("What animal do you want?");
        System.out.println("Type 1 for Dog or 2 for Cat.");

        int choice=scanner.nextInt();

        if(choice == 1){
            animal=new Dog();
        }else if(choice == 2){
            animal=new Cat();
        }else{
            animal=new Animal();
            System.out.println("Choice was invalid.");
        }
        animal.speak();

    }
}