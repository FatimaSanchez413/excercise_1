

package LE11;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainGUI {
    public static void main(String[] args) {
      
        UIManager.put("OptionPane.background", new Color(30, 30, 30));
        UIManager.put("Panel.background", new Color(30, 30, 30));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);

        String input = JOptionPane.showInputDialog(null, "Enter amount (from 1 - 99 cents):");
        
        if (input != null && !input.isEmpty()) {
            int amount = Integer.parseInt(input);

            ChangeDenomination cd = new ChangeDenomination();
            cd.calculateChange(amount);

            String result = "Your change is\n" +
                            cd.getQuarters() + " quarter\n" +
                            cd.getDimes() + " dime\n" +
                            cd.getNickels() + " nickel\n" +
                            cd.getPennies() + " penny";

            JOptionPane.showMessageDialog(null, result);
        }
    }
}
