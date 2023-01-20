public class Main{
    public static void main(String[] args) {
        shout(1);
        shout("Hehehe");
        shout(44.6);

        shout2(22.5, "lalala");
    }
    private static <T> void shout(T thingToShout){
        System.out.println(thingToShout+" !!!!!!!");
    }
    //Multiple types together
    private static <T,V> void shout2(T thing1, V thing2){
        System.out.println(thing1+" and "+thing2+"!!!!");
    }
}