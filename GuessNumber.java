package cwh;

import java.util.Random;
import java.util.Scanner;
class GuessTheNumberGame{
    int RandomNumber;
     int InputNumber;
     int NoOfGuesses = 0;

     public void RandomNumberGenerator(){
        Random random = new Random();
        RandomNumber = random.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        NoOfGuesses++;
        if (InputNumber==RandomNumber){
            System.out.printf("Yes you guessed it right,You took  %d attempts\n",NoOfGuesses);
            return true;
        }
        else if(NoOfGuesses>=6)
        {
            System.out.println("You Exhausted your 6 attempts");
            System.out.printf("The number was:%d\n",RandomNumber);
            return true;

        }
        else if(InputNumber<RandomNumber){
            System.out.printf("Number is greater than %d\n",InputNumber);
        }
        else if(InputNumber>RandomNumber){
            System.out.printf("Number is smaller than %d\n",InputNumber);
        }
        return false;

    }

}
public class GuessNumber {
    public static void main(String[] args) {

        GuessTheNumberGame g = new GuessTheNumberGame();
        g.RandomNumberGenerator();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}