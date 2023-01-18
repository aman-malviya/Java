public class Main{
    public static void main(String[] args) {
        /*
         * Static is a modifier
         * A single copy of a variable/method is created and shared among all the objects.
         * The class owns the static member.
         */

        Friend f1=new Friend("Aman");
        Friend f2=new Friend("Malviya");

        //f1 and f2 share the variable numberOfFriends

        //numberOfFriends variable is owned by the class and it can be accessed as follows
        System.out.println(Friend.numberOfFriends);

        //static methods are also owned by the class and they can be accessed as follows
        Friend.displayFriends();

        //Not recommended
        System.out.println(f1.numberOfFriends);
    }
}