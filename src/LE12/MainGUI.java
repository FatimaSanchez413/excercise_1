package LE12;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainGUI {
    public static void main(String[] args) {
        
        UIManager.put("OptionPane.background", new Color(30, 30, 30));
        UIManager.put("Panel.background", new Color(30, 30, 30));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);

        String input = JOptionPane.showInputDialog(null, "Enter a number between 0 and 1000:");

        if (input != null && !input.isEmpty()) {
            int num = Integer.parseInt(input);

            MultiplyDigits md = new MultiplyDigits();
            md.processNumber(num);

            String digitsText = "";
            if (md.getDigit1() != 0) {
                digitsText += md.getDigit1() + "\n";
            }
            if (md.getDigit1() != 0 || md.getDigit2() != 0) {
                digitsText += md.getDigit2() + "\n";
            }
            digitsText += md.getDigit3() + "\n";

            String result = digitsText + "The product of all digits in " + num + " is " + md.getProduct();

            JOptionPane.showMessageDialog(null, result);
        }
    }
}