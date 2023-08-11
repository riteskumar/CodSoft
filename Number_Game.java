import java.util.*;
public class Number_Game {
    public static void main(String[] args) {
        System.out.println("\t\t\t NUMBER GAME \t\t\t");
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // for generating random number
        int score = 0, n, num;
        char play;
        System.out.println("\nYou have 5 trials \n");
        do {
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter a number = ");
                n = sc.nextInt();
                num = random.nextInt(100); // range from 1 --> 100
                if (num == n) {
                    score++;
                    System.out.println("You won");
                } else if (num > n) {
                    System.out.println("Your guess is TOO LOW");
                } else {
                    System.out.println("Your guess is TOO HIGH");
                }
            }
            System.out.println("\nYour total score is " + score + "\n");
            System.out.print("Do play again?(y/n): ");
            play = sc.next().charAt(0);
            System.out.println();
        } while (play == 'Y' || play == 'y');


    }
}
