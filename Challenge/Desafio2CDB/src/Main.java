import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insert two numbers in the same line: ");
        String input = scanner.nextLine();

        String[] inputSplit = input.split(" ");

        double media = Double.parseDouble(inputSplit[0]) / Double.parseDouble(inputSplit[1]);

        System.out.printf("The media is: " + "%.2f", media);
    }
}
