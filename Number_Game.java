import java.util.*;
public class Number_Game {
    public static void main(String[] args) {
        System.out.println("------------- NUMBER GAME ----------------");
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // for generating random number
        int score, n, num;
        String play;
        System.out.println("\nYou have 7 trials \n");

        do {
            score = 0;
            num = random.nextInt(100) + 1;    // range from 1 --> 100
            for (int i = 1; i <= 7; i++) {
                System.out.print("Enter a number = ");
                n = sc.nextInt();
                if (num == n) {
                    score++;
                    System.out.println("Congratulation!!! You won");
                    num = random.nextInt(100) + 1;
                } else if (num > n) {
                    System.out.println("Your guess is TOO LOW");
                } else {
                    System.out.println("Your guess is TOO HIGH");
                }
            }
            System.out.println("\nYour total score is " + score + "\n");
            System.out.print("Do you play again?(Yes/No): ");
            play = sc.next();
            System.out.println();
        } while (play.equals("Yes") || play.equals("yes"));


    }
}
