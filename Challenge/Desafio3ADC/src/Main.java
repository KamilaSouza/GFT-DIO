import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTotal = scanner.nextInt();
        int numFigCompradas = scanner.nextInt();
        Set<Integer> setFig = new HashSet<>();
        for (int i = 0; i < numFigCompradas; i++) {
            setFig.add(scanner.nextInt());
        }
        System.out.println(numTotal - setFig.size());
    }
}
