import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*
         * Exception: An event that occurs during the execution of a program 
         *            that disrupts the normal flow of instructions.
         * 
         */
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter the dividend");
            int x=scanner.nextInt();
            System.out.println("Enter the divisor");
            int y=scanner.nextInt();
    
            System.out.println("Answer is "+x/y);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            scanner.close();
        }

    }
}