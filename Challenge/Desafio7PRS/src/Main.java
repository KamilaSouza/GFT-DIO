import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Polygon - Enter the number of sides and their length (N L): ");
        String N = scanner.nextLine();
        String[] split = N.split(" ");
        int perimeter = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);

        System.out.println("The polygon perimeter is: " + perimeter);
    }
}

