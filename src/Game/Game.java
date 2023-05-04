package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] words = {"Hund", "Milch", "Cola"};
        String[] articles = {"der", "die", "die"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            boolean correctAnswer = false;
            while (!correctAnswer) {
                System.out.println("Geben Sie den richtigen Artikel für \"" + words[i] + "\" ein:");
                String userAnswer = scanner.nextLine();

                if (userAnswer.equals(articles[i])) {
                    System.out.println("Richtig!");
                    correctAnswer = true;
                } else {
                    System.out.println("Falsch, versuchen Sie es erneut.");
                }
            }
        }
    }
}
