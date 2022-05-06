import javax.swing.*;

public class UncheckedException {

    public static void main(String args[]) {

        Boolean looping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerator: ");
            String b = JOptionPane.showInputDialog("Denominator: ");

            try {
                int result = division(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Result: " + result);
                looping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Invalid input, only numbers allowed! " + e.getMessage());
//            System.out.println("Invalid input, only numbers allowed! "+ e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Denominator can not be 0! ");
            } finally {
                System.out.println("Finally block. ");
            }
        }
        while (looping);
        System.out.println("The code continue...");
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
