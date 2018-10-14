import javax.swing.*;

public class Parsing {
    public static void main(String[] args) {
        //converting int to string
        int num = 5;
        String word = "" + 5;

        System.out.println(num + word);

        String word2 = "50";
        int num2 = Integer.parseInt(word2);
        System.out.println(num2 + num);

        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age..."));
        System.out.println(num3 + 1);
    }
}
