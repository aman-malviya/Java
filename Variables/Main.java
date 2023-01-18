public class Main {
    public static void main(String[] args) {
        boolean a=true; //1 bit - primitive
        byte b=25;  //1 byte - primitive - (-128 to 127)
        short c=345;    //2 bytes - primitive
        int d=345678;   //4 bytes - primitive
        long e=7;   //8 bytes - primitive
        float f=0.24f; //4 bytes - primitive - 6-7 places after decimal
        double g=0.24; //8 bytes - primitive - 15 places after decimal
        char h='a'; //2 bytes - primitive - single character
        String i="Hello!"; //variable size - reference - sequence of characters


        int num; //declaration
        num=10; //assignment
        int num2=20; //initialization
        System.out.println("Sum is: "+(num+num2));
        System.out.println("Sum is: "+num+num2);
    }
}
