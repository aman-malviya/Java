public class Main{
    public static void main(String[] args) {
        String day="Pizza";

        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday");
                break;          //breaks are important because if any of the cases evaluate to be true then if the break statement is not there all the succeeding case statements will be executed until we encounter a break statement.
            case "Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            default:
                System.out.println("Get lost!");
                break;
        }
    }
}