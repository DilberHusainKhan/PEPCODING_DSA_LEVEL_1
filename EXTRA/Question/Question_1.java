import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

/**
 * Game
 */
class Game {
    public int number;
    public int noOfGuess = 0;
    public int inputNumber;

    // getter
    public int getNoOfGuess() {
        return noOfGuess;
    }

    // setter
    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    // constructor
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    // method 1
    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number");
        inputNumber = sc.nextInt();
    }

    // method 2
    boolean isCorrectNumber() {
        noOfGuess++;
        if (inputNumber == number) {
            System.out.println(
                    "Yes you guess it right, It was " + number + " You  guessed in it in " + noOfGuess + " attempts");
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }

}

public class Question_1 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            // System.out.println(b);
            // System.out.println(g.number);
        }
    }
}
