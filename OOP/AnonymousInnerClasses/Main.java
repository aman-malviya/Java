public class Main{
    public static void main(String[] args) {
        
        Animal animal=new Animal();
        animal.makeNoise();

        /*
         * Anonymous Inner Class
         * It is a class with no name which we use to instantiate only one object ever.
         */

        //Anonymous Inner Class which is a subclass of Animal class
        Animal bigfoot=new Animal(){
            @Override
            public void makeNoise(){
                System.out.println("grwalllheheheh");
            }
        };
        //The code inside curly braces depicts an anonymous inner class which is a subclass of class Animal
        bigfoot.makeNoise();

        //Independent Anonymous Inner Class using (implementing) Runnable interface
        Runnable myAnonymousRunnable=new Runnable(){
            @Override
            public void run(){
                System.out.println("I am an anonymous runnable");
            }
        };
        //The code inside curly braces depicts an anonymous inner class that implements Runnable
        myAnonymousRunnable.run();
    }

}