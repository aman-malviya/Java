public class Main{
    public static void main(String[] args) {
        /*
         * Wrapper class provides a way to use primitive data types as reference data types
         * because reference data types contain useful methods
         * can be used with collections (e.g. ArrayList)
         * 
         * Primitive        Wrapper
         * boolean          Boolean
         * char             Character
         * int              Integer
         * double           Double
         * 
         * Autoboxing: The automatic conversion that the Java compiler makes between the primitve types and their corresponding object wrapper class
         * Unboxing: The reverse of autoboxing. Automatic conversion of wrapper class to primitive type.
         */

         Boolean a=true;
         Integer b=123;     //autoboxing
         Double c=3.14;
         Character d='t';

         //Now we can access methods with a, b, c and d
    }
}