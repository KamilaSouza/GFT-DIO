import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insert the number of wine: ");
        String T = scanner.nextLine();
        System.out.printf("Insert the answers: ");
        String respostasCompetidores = scanner.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;
        for (int i = 0; i < respostasCompetidoresSplit.length; i++) {
            if (Objects.equals(respostasCompetidoresSplit[i], T)) {
                count++;
            }
        }
        System.out.println("Correct answers: " + count);
    }

}
