
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nicolas
 */
public class methods {

    public static JButton scaleImage(JButton a, String b) {

        ImageIcon icon = new ImageIcon(b);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        a.setIcon(scaledIcon);
        return null;
    }

    public static JLabel scaleImage1(JLabel a, String b) {

        ImageIcon icon = new ImageIcon(b);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        a.setIcon(scaledIcon);
        return null;
    }

    public static int[] validar(JComboBox a, String b, int[] c) {
        if (a.getSelectedItem().toString().equalsIgnoreCase(b)) {
            c[0]++;
        } else if (a.getSelectedItem().toString().equalsIgnoreCase("Elija una opcion")) {
            c[1]++;
        } else {
            c[2]++;
        }
        return c;
    }

}
