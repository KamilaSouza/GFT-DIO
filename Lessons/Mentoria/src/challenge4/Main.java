package challenge4;

//Jogo de Craps:
//        Faça um programa que implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12.
//        Regras:
//
//        a) Se, na primeira jogada, você tirar 7 ou 11, você é um "Natural" e ganha;
//        b) Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "Craps" e você perdeu;
//        c) Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10, este é seu "Ponto";
//        d) Seu objetivo agora é continuar jogando os dados até tirar este número novamente;
//        e) Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        do {
            System.out.println("Roll the dice!");
            Random random = new Random();
            int number1 = random.nextInt(6) + 1;
            int number2 = random.nextInt(6) + 1;
            int round = 1;
            int sum = number1 + number2;
            int point = 0;

            if (round == 1) {
                if ((sum == 7) || ((sum == 11))) {
                    System.out.println("You got " + number1 + "-" + number2 + ", sum: " + (number1 + number2) + "! You are a natural!");
                    break;
                } else if ((sum == 2) || ((sum == 3)) || ((sum == 12))) {
                    System.out.println("You got " + (number1 + number2) + "! Craps, you lose!");
                    break;
                } else {
                    System.out.println("You got " + number1 + "-" + number2 + ", sum: " + (number1 + number2) + ". It is your point.");
                    point = sum;
                    round++;
                    System.out.println("Round " + round + "!");
                }
            }
            if (round == 2) {
                do {
                    number1 = random.nextInt(6) + 1;
                    number2 = random.nextInt(6) + 1;
                    sum = number1 + number2;
                    if (sum == 7) {
                        System.out.println("You got " + number1 + "-" + number2 + ", sum: 7, you lose!");
                        break;
                    } else if (sum == point) {
                        System.out.println("You won! You got " + sum + ", the same number of your point: " + point + ".");
                        break;
                    } else {
                        System.out.println("You got " + number1 + "-" + number2 + ", sum: " + (number1 + number2) + ".");
                        round++;
                        System.out.println("Round " + round + "!");
                    }
                } while (sum != point);
                break;
            }
        } while (true);
    }
}
