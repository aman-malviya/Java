import java.util.Random;
public class DiceRoller{
    Random random;  //Global Variable
    DiceRoller(){
        random=new Random();
    }
    void roll(){
        int number=random.nextInt(1,7); //local variable
        System.out.println(number); 
    }
}