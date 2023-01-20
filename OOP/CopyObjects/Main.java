public class Main{
    public static void main(String[] args) {
        Car car1=new Car("BMW","Black",2005);
        Car car2=new Car("Ferrari","White", 2009);
        
        // System.out.println(car1);
        // System.out.println(car1.info());
        // System.out.println("-------------------");
        // System.out.println(car2);
        // System.out.println(car2.info());
        // System.out.println("-------------------");


        // car2=car1; //By doing this we are assigning the address of car1 to car2 which is not at all recommended
        // System.out.println(car1);
        // System.out.println(car2);

        //Instead we can have a method for copying
        // car2.copy(car1);

        //Now they will have different addresses but same value for attributes
        // System.out.println(car1);
        // System.out.println(car1.info());
        // System.out.println(car2);
        // System.out.println(car2.info());

        //Or we can have a copy constructor
        Car car3=new Car(car1);
        System.out.println(car3);
        System.out.println(car3.info());
        System.out.println(car1);
        System.out.println(car1.info());

    }
}