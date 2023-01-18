import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int a=random.nextInt(1, 7);
        double b=random.nextDouble();
        boolean c=random.nextBoolean();

        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);
    }
}
