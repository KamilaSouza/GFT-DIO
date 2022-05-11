import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int number = scanner.nextInt();
            numbers.add(number);
        }

        Integer max = Collections.max(numbers);
        System.out.println("The biggest number is: " + max);
        int position = numbers.indexOf(max) +1;
        System.out.println("Entering position of your biggest number: " + position);
    }
}
