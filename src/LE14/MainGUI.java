package LE14;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainGUI {
    public static void main(String[] args) {
    
        UIManager.put("OptionPane.background", new Color(30, 30, 30));
        UIManager.put("Panel.background", new Color(30, 30, 30));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);

        String p1Input = JOptionPane.showInputDialog(null, "Enter x1 and y1 (separated by space):");
        String p2Input = JOptionPane.showInputDialog(null, "Enter x2 and y2 (separated by space):");

        if (p1Input != null && p2Input != null) {
            String[] p1 = p1Input.trim().split("\\s+");
            String[] p2 = p2Input.trim().split("\\s+");

            if (p1.length >= 2 && p2.length >= 2) {
                double x1 = Double.parseDouble(p1[0]);
                double y1 = Double.parseDouble(p1[1]);
                double x2 = Double.parseDouble(p2[0]);
                double y2 = Double.parseDouble(p2[1]);

                DistanceBetweenPoints dbp = new DistanceBetweenPoints();
                dbp.calculateDistance(x1, y1, x2, y2);

                String result = "The distance between the two points is " + dbp.getDistance();

                JOptionPane.showMessageDialog(null, result);
            }
        }
    }
}