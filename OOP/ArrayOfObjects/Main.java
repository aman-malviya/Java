public class Main{
    public static void main(String[] args) {
        Food[] refridgerator=new Food[3];

        refridgerator[0]=new Food("Icecream");
        refridgerator[1]=new Food("Burger");
        refridgerator[2]=new Food("Pizza");

        for(Food f:refridgerator){
            System.out.println(f.name);
        }
    }
}