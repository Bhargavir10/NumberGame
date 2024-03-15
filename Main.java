/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            Random random = new Random();
            int minrange = 1;
            int maxrange = 100;
            int maxattempts = 5;
            int score = 0;
            System.out.println("Welcome to the Number Guessing Game!");
            do{
                int targetNumber = random.nextInt(maxrange-minrange+1)+minrange;
                System.out.print("\nNew round started! Guess the number between 1 and 100:\n");
                for(int attempt = 1;attempt <= maxattempts;attempt++){
                    System.out.print("Attempt #"+attempt+"Enter your guess:");
                    int guess=scanner.nextInt();
                    if(guess == targetNumber){
                        System.out.println("Congratulations!You gussed the correct number");
                        score++;
                        break;
                    }else if(guess<targetNumber){
                        System.out.println("Too low!Try again.");
                    }else{
                            System.out.println("Too high!Try again.");
                        }
                        if(attempt == maxattempts){
                            System.out.println("Sorry,you've runout of attempts.\nThe correct number is "+targetNumber);
                        }   
                }
                System.out.print("Do you want to play again? (yes/no)");
            }while((scanner.next()).equalsIgnoreCase("yes"));
            System.out.println("\nGame Over!Your final score is:"+score);
        }
    }
}