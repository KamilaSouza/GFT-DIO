import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insert the number of slots: ");
        int numTotal = scanner.nextInt();
        System.out.printf("Insert the number of packs you bought: ");
        int numFigCompradas = scanner.nextInt();
        System.out.printf("Insert the code of cards: ");
        Set<Integer> setFig = new HashSet<>();
        for (int i = 0; i < numFigCompradas; i++) {
            setFig.add(scanner.nextInt());
        }
        System.out.println("Number of cards you need to complete the album: " + (numTotal - setFig.size()));
    }
}
