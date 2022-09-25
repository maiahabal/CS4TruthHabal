import java.util.Random;
import java.util.Scanner;

public class q1ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numGuesses = 5;
        int upperLimit = 10;
        int lowerLimit = 0;
        int number;
        int choice;
        int playagain = 1;
        do{
            System.out.println("\nWelcome to Higher or Lower! What will you do?\n[1] Start Game\n[2] Change Settings\n[3] End Application");
            choice = sc.nextInt();   
            switch(choice){
                case 1:
                    number = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
                    for (int i = 0; i < numGuesses; i++){
                        System.out.printf("\nThere are %d guess(es) left. What is your guess? ", numGuesses - i);
                        int guess = sc.nextInt();
                        if(guess > upperLimit || guess < lowerLimit){
                            System.out.println("Your guess is out of range. Guess is not valid.");
                            i--;
                        } else if (guess > number){
                            System.out.print("Your guess is higher than the number. ");
                        } else if (guess < number){
                            System.out.print("Your guess is lower than the number. ");
                        } else if (guess == number){
                            System.out.println("\nYou got it!");
                            System.out.println("Play Again?\n[1] yes\n[2] no");
                            playagain = sc.nextInt();
                            break;
                        }

                        if (i == numGuesses - 1) {
                            System.out.printf("\nThe correct answer was %d.\n", number);
                        }
                    }
                    break;
            case 2:
                System.out.println("\nInsert the lower limit: ");
                    lowerLimit = sc.nextInt();
                System.out.println("Insert the upper limit: ");
                    upperLimit = sc.nextInt();
                System.out.println("Insert the number of guesses: ");
                    numGuesses = sc.nextInt();
                System.out.printf("\nSettings Changed!\nUpper limit: %d\nLower limit: %d\nNumber of Guess: %d\n", upperLimit, lowerLimit, numGuesses);
                break;
            case 3:
                System.exit(0);
            }
        }while(playagain == 1);
        sc.close();
    }
}
