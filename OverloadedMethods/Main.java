public class Main{
    public static void main(String[] args) {
        /*
         * Overloaded Methods: Methods that share the same name but have different parameters
         * Method Signature: Method name + Parameters
         * Duplicate Methods (error): Methods with same method signatures (same mthod name and same order and datatypes of parameters).
         */
        int x=add(1,2);
        System.out.println(x);
        int y=add(1,2,3);
        System.out.println(y);
        int z=add(1,2,3,4);
        System.out.println(z);
        double a=add(1.2, 5.77);
        System.out.println(a);
    }
    static int add(int a, int b){
        System.out.println("Method 1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("Method 2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("Method 3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("Method 4");
        return a+b;
    }
}