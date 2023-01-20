public class Car{
    private String name;
    private String color;
    private int year;

    Car(String name, String color, int year){
        this.name=name;
        this.color=color;
        this.year=year;
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
    public void setYear(int year){
        this.year=year;
    }
}