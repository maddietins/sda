import java.util.Scanner;

public class Main {
    public static DiceShaker shaker;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter an option 1= single dice 2= double dice 3=Fixed");

        String option = scanner.nextLine();  // Read user input

        if (option.equals("1")) {
            shaker = new RandomSingleDiceShaker();
        }
        else if (option.equals("2")) {
            shaker = new RandomDoubleDiceShaker();
        }
        else if (option.equals("3")) {
            shaker = new FixedSingleDiceShaker();
        };
        System.out.format("Shake %d%n", shaker.next());
    }
}