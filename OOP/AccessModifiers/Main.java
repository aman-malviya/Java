
public class Main{
    /*
     * Any attribute with the public keyword is accessible to all the packages within the project.
     * By default the attributes of the class are accessible to all the classes within the same package.
     * Any attributes with the protected keyword are accessible within the current class and its child classes only.
     * Any attributes with the private keyword are accessible within the current class only.
     */

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.protectedMessage);
        System.out.println(a.publicMessage);

        //Private member can not be accessed
        // System.out.println(A.privateMessage);
        //error

        
    }
}