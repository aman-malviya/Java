import java.util.Optional;

public class Main{
    public static void main(String[] args) {
        /*
         * An optional is a container that either has something in it or not.
         */
        Cat myCat=findCatByName("Fred");
        /*
         * If cat with name Fred is not in the database then the findCatByName method will return a null ofcourse
         * In that case the below mentioned line of code will throw an error, because we cant access getName() method of a NULL
         */
        System.out.println(myCat.getAge());

        /*
         * To avoid the above mentioned issue we can do something like
         */

        if(myCat == null){
            System.out.println("No cat found");
        }else{
            System.out.println(myCat.getAge());
        }

        /*
         * But this thing becomes more elaborative with optionals
         */
        Optional<Cat> myCat2=findCatByName_withOptional("George");

        /*
         * If cat with name George is not in the database then the findCatByName_withOptional method will return a null ofcourse
         * In that case the below mentioned line of code will again throw an error, because we cant access getName() method of a NULL
         */
        System.out.println(myCat2.get().getAge());

        //To avoid this
        if(myCat2.isPresent()){
            System.out.println(myCat2.get().getAge());
        }else{
            System.out.println("No cat found");
        }

        /*
         * But optionals have more power
         */

        Optional<Cat> optionalCat=findCatByName_withOptional("Tada");
        Cat myCat3=optionalCat.orElse(new Cat("Anonymous Cat", 0)); //If optionalCat is null this expression will assign a new cat with "anonymous cat" name and age "0" to myCat3 variable 

        System.out.println(myCat3.getAge());

        // More power
        int age=optionalCat.map(Cat::getAge).orElse(0);
        System.out.println(age);
        
        /* 
         * Optionals were only intended to be used a s a return type to tell the user of that method that the
         * value they are looking for might not exist and they have to be prepared to deal with it.
         * 
         * Optionals were not intended to be used just anywhere.
         */
        
    }
    private static Cat findCatByName(String name){
        Cat cat=new Cat(name, 3); //This is for example purposes, we have to suppose that we are fetching this cat object from the database
        return cat;
    }
    private static Optional<Cat> findCatByName_withOptional(String name){
        Cat cat=new Cat(name, 2);
        return Optional.ofNullable(cat);
    }
}