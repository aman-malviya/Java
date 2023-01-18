import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog(null, "Enter you name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old.");
    }
}
