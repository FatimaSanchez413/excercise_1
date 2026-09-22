package LE13;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainGUI {
    public static void main(String[] args) {
       
        UIManager.put("OptionPane.background", new Color(30, 30, 30));
        UIManager.put("Panel.background", new Color(30, 30, 30));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);

        String weightInput = JOptionPane.showInputDialog(null, "Enter weight in pounds:");
        String heightInput = JOptionPane.showInputDialog(null, "Enter height in inches:");
        String ageInput = JOptionPane.showInputDialog(null, "Enter age in years:");

        if (weightInput != null && heightInput != null && ageInput != null) {
            double weight = Double.parseDouble(weightInput);
            double height = Double.parseDouble(heightInput);
            int age = Integer.parseInt(ageInput);

            ChocolateBars cb = new ChocolateBars();
            cb.calculateBars(weight, height, age);

            String result = String.format("Chocolate bars needed to maintain weight:\n\n" +
                                          "Woman: %.2f bars\n" +
                                          "Man: %.2f bars", 
                                          cb.getWomanBars(), cb.getManBars());

            JOptionPane.showMessageDialog(null, result);
        }
    }
}