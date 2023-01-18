import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /*
         * ArrayList:   A resizable array like vector in C++
         *              Elements can be added and removed after compilation
         *              Can only store reference data types
         */

         ArrayList<String>food=new ArrayList<String>();
         food.add("Momos");
         food.add("Pizza");

         for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
         }
         System.out.println();
         food.set(0, "Dosa");
         for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
         }
         System.out.println();
         food.remove(0);
         for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
         }
         food.clear();





    }
}
