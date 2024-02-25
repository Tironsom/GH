package VIew;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edufr
 */
  import javax.swing.JOptionPane;
public class except {



    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
           
            return true;  
        } catch (NumberFormatException e) {
     
            return false;
        }
    }

    public boolean isString(String s) {
        return s.matches("[a-zA-Z]+");
    }

    public static void Error(String message) {
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
