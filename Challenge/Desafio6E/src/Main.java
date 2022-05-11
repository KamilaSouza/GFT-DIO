import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Insert the radius: ");
        double R = scanner.nextDouble();
        double volume = (4 / 3.0) * pi * (Math.pow(R, 3.0));
        System.out.printf("VOLUME = %.3f%n", volume);
    }

}

