public class Main{
    public static void main(String[] args) {
        /*
         * local : declared inside a method
         *         accessible only to that method
         * 
         * Global : declared outside the method but within a class
         *          accessible to all parts of the class
         */

        DiceRoller d=new DiceRoller();
        d.roll();
    }
}