package challenge1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a 4 digits positive and integer number (XXXX): ");
            int number = scanner.nextInt();
            String numberAux = String.valueOf(number);
            if (number >= 1000 && number <= 9999) {
                StringBuilder stringBuilder = new StringBuilder(numberAux);
                System.out.println(stringBuilder.reverse());
                break;
            } else if (numberAux.length() < 4) {
                System.out.println("Enter a 4 digits number!");
            }
        }
        while (true);
    }
}
