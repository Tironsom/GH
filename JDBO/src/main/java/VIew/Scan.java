package VIew;


import javax.swing.JTextField;

public class Scan {

    public static int readInt(JTextField textField) {
        String input = textField.getText();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
        
            return 0; 
        }
    }

    public static double readDouble(JTextField textField) {
        String input = textField.getText();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
           
            return 0.0; 
        }
    }

    public static String readString(JTextField textField) {
        return textField.getText();
    }
}