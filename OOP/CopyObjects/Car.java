public class Car{
    private String name;
    private String color;
    private int year;

    Car(String name, String color, int year){
        this.name=name;
        this.color=color;
        this.year=year;
    }
    Car(Car car){
        this.setName(car.name);
        this.setColor(car.color);
        this.setYear(car.year);
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return this.year;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String info(){
        return "{\n\tName: "+this.name+",\n\tColor: "+this.color+",\n\tYear: "+this.year+"\n}";
    }
    public void copy(Car car){
        this.setName(car.name);
        this.setColor(car.color);
        this.setYear(car.year);
    }
}