public class Pizza{
    String bread, suace, cheese, topping;
    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread=bread;
        this.suace=sauce;
        this.cheese=cheese;
        this.topping=topping;
    }
    Pizza(String bread, String sauce, String cheese){
        this.bread=bread;
        this.suace=sauce;
        this.cheese=cheese;
    }
    Pizza(String bread, String sauce){
        this.bread=bread;
        this.suace=sauce;
    }
    Pizza(String bread){
        this.bread=bread;
    }
    Pizza(){
        
    }
}