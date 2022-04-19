import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int in = 0;
        int out = 0;
        int i;

        System.out.printf("Enter the size of your list: ");
        int N = scan.nextInt();
        System.out.printf("Enter the values of list: ");
        for (i = 0; i < N; i++) {
            int X = scan.nextInt();
            if (X >= 10 & X <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out", out);

    }

}
