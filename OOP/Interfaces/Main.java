public class Main{
    public static void main(String[] args) {
        /*
         * Interface is a template that can be applied to a class.
         * Similar to inheritance but it specifies what a class should/must do.
         * Classes can apply more than one interface
         */

        Rabbit rabbit=new Rabbit();
        rabbit.flee();

        Hawk hawk=new Hawk();
        hawk.hunt();

        Fish fish=new Fish();
        fish.flee();
        fish.hunt();
    }
}