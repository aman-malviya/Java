public class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "{\n\tName: "+this.name+",\n\tAge: "+this.age+",\n}";
    }
}