public class Car{
    String name, color;
    int year;
    double price;

    //Constructor: A method which is invoked when the object of a class is created
    Car(String name, int year, String color, double price){ 
        this.name=name;
        this.year=year;         //this keyword holds the reference of the current object
        this.color=color;
        this.price=price;
    }
    void drive(){
        System.out.println("Driving "+this.name+" "+this.year+" of color "+this.color+" of price "+this.price);
    }
    void brake(){
        System.out.println("Stopping "+this.name+" "+this.year+" of color "+this.color+" of price "+this.price);
    }
    public String toString(){
        String s="{\n\tName: "+this.name+",\n\tColor: "+this.color+",\n\tYear: "+this.year+",\n\tPrice: "+this.price+"\n}";
        return s;
    }
}