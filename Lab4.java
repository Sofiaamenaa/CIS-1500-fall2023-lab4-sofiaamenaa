public class Lab4 {
    import java.util.Random;
    import java.util.Scanner;
    public static void main(String [] args){

        Scanner scanner = new scanner(System.in);
        Random random = new Random();

        int playerChoice;
        int computerChoice;

        playerChoice = scanner.nextInt();

        if (playerChoice == 6){
            System.out.println("Thanks for playing!");
            break:
        }

        if (playerChoice < 1 || playerChoice > 5)
            System.out.println("Please enter a valid command. Choose from 1, 2, 3, 4 or 5");
        continue;

        computerChoice = random.nextInt(5) + 1;

        System.out.println("Computer choose: " + getChoiceName(computerChoice));

    }
}
