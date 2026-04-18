//Morse code practice website
//@Justin Zhang
//04/17/2026
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Random rand = new Random();
        
        int randomNumber;
        int numCharEncode;
        String input = "";
        String addedEncoder = "";
        String randomMessage = "";
        String correctAnswer = "";
        

        System.out.print("Would you like to encode or decode? (E/D)");
        String type = scanner.nextLine();

        if (type.equals("E") || type.equals("e")) {
            System.out.println("You have chosen to encode");
            System.out.println("How many characters would you like to encode?");
            numCharEncode = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < numCharEncode; i++) {
                randomMessage += MorseDictionary.letters.get(rand.nextInt(27));
            }

            correctAnswer = MorseDictionary.encodeMessage(randomMessage);
            System.out.println("Here is your random message \n" + "|" + randomMessage + "|");
            System.out.println("Please enter your translation");
            input = scanner.nextLine();

            if (input.equals(correctAnswer) || (input.equals(correctAnswer.substring(0, correctAnswer.length() - 1)))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }

        } else if (type.equals("D") || type.equals("d")) {
            System.out.println("You have chosen to decode");
            System.out.println("How many characters would you like to decode?");
            numCharEncode = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < numCharEncode; i++) {
                randomMessage += MorseDictionary.mcodes.get(rand.nextInt(27)) + " ";
            }

            correctAnswer = MorseDictionary.decodeMessage(randomMessage);

            System.out.println("Here is your random message + \n" + "|" + randomMessage + "|");
            System.out.println("Please enter your translation");
            input = scanner.nextLine();
            if (input.toUpperCase().equals(correctAnswer) || (input.toUpperCase().equals(correctAnswer.substring(0, correctAnswer.length() - 1)))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }

    }
}