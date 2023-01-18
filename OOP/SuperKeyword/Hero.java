public class Hero extends Person{
    String power;

    Hero(String name, int age, String power){
        // this.name=name;
        // this.age=age;    these lines will throw error

        super(name, age); //the constructor of Person (parent class) is called
        this.power=power;
    }
    public String toString(){
        return super.toString()+"\b\tPower: "+this.power+",\n}";
    }
}