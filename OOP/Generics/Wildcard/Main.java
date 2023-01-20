import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList<String> b = new ArrayList<>();
        b.add("Hi");
        b.add("Hello");

        printList(a);
        printList(b);

        // printIntegerList(b);
        // throws error

        // while 
        printIntegerList(a);
        //works just fine
    }
    private static void printList(ArrayList<?> list){
        System.out.println(list);
    }
    private static void printIntegerList(ArrayList<? extends Integer> list){
        System.out.println(list);
    }
}