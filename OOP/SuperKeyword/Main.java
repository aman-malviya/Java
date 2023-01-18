public class Main{
    public static void main(String[] args) {
        
        /*
         * Super Keyword refers to the super class (parent class) of an object.
         * Very similar to 'this' keyword.
         * super() calls the constructor of the parent class
         */

        Hero hero1=new Hero("Batman",42,"$$$");
        Person p=new Person("Aman", 23);
        System.out.println(hero1);
        System.out.println(p);
    }
}