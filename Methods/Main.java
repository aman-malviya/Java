public class Main{
    public static void main(String[] args) {
        hello("Aman", 23); //Invoking hello() method
        //Can not make a static reference to a non static method, hello() needs to be static
        System.out.println("Sum is "+add(2,3));
    }
    static void hello(String name, int age){
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
    }
    static int add(int x, int y){
        return x+y;
    }
}