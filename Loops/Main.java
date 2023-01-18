import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name="";
        while(name.isBlank()){
            System.out.print("Enter your name: ");
            name=scanner.nextLine();
        }
        System.out.println("Hello "+name);

        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }
}
