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
        
        boolean encodeDecodeChoice = true;
        boolean runAgain = true;
        boolean runLoop = true;
        int randomNumber;
        int numCharEncode;
        String input = "";
        String addedEncoder = "";
        String randomMessage = "";
        String correctAnswer = "";
        String againStr = "";
        String purpose = "";
        
        while (runAgain) {
            encodeDecodeChoice = true;
            runLoop = true;
            randomMessage = ""; 
            correctAnswer = "";
            
            System.out.println("Would you like to practice or use as a tool? (P/T)");
            purpose = scanner.nextLine();
            if (purpose.toUpperCase().equals("P")) {
                while (encodeDecodeChoice) {
                    System.out.print("Would you like to encode or decode? (E/D)");
                    String type = scanner.nextLine();
        
                    if (type.equals("E") || type.equals("e")) {
                        encodeDecodeChoice = false;
                        System.out.println("You have chosen to encode");
                        System.out.println("How many characters would you like to encode?");
                        numCharEncode = Integer.parseInt(scanner.nextLine());
        
                        for (int i = 0; i < numCharEncode; i++) {
                            randomMessage += MorseDictionary.letters.get(rand.nextInt(37));
                        }
        
                        correctAnswer = MorseDictionary.encodeMessage(randomMessage);
                        System.out.println("Here is your random message inside |message| \n" + "|" + randomMessage + "|");
                        System.out.println("Please enter your translation");
                        input = scanner.nextLine();
        
                        if (input.equals(correctAnswer) || (input.equals(correctAnswer.substring(0, correctAnswer.length() - 1)))) {
                            System.out.println("Correct!");
                            runAgain = askToRunAgain(scanner);
                        } else {
                            System.out.println("Incorrect.");
                            System.out.println("The correct answer was:" + correctAnswer);
                            runAgain = askToRunAgain(scanner);
                        }
                    } else if (type.equals("D") || type.equals("d")) {
                        encodeDecodeChoice = false;
                        System.out.println("You have chosen to decode");
                        System.out.println("How many characters would you like to decode?");
                        numCharEncode = Integer.parseInt(scanner.nextLine());
        
                        for (int i = 0; i < numCharEncode; i++) {
                            randomMessage += MorseDictionary.mcodes.get(rand.nextInt(37)) + " ";
                        }
        
                        correctAnswer = MorseDictionary.decodeMessage(randomMessage);
        
                        System.out.println("Here is your random message inside |message|+ \n" + "|" + randomMessage + "|");
                        System.out.println("Please enter your translation");
                        input = scanner.nextLine();
                        if (input.toUpperCase().equals(correctAnswer) || (input.toUpperCase().equals(correctAnswer.substring(0, correctAnswer.length() - 1)))) {
                            System.out.println("Correct!");
                            runAgain = askToRunAgain(scanner);
                        } else {
                            System.out.println("Incorrect.");
                            System.out.println("The correct answer was:" + correctAnswer);
                            runAgain = askToRunAgain(scanner);
                        }
                    }
                }
            } else if (purpose.toUpperCase().equals("T")) {
                System.out.println("Would you like to encode or decode? (E/D)");
                String type = scanner.nextLine();
                if (type.toUpperCase().equals("E")) {
                    System.out.println("What would you like to encode?");
                    String message = scanner.nextLine();
                    System.out.println(MorseDictionary.encodeMessage(message.toUpperCase()));
                    runAgain = askToRunAgain(scanner);
                } else if (type.toUpperCase().equals("D")) {
                    System.out.println("What would you like to decode?");
                    String message = scanner.nextLine();
                    System.out.println(MorseDictionary.decodeMessage(message));
                    runAgain = askToRunAgain(scanner);
                }
            } else {
                System.out.println("That is not a valid response");
            }
        }
    }
    public static boolean askToRunAgain(Scanner scanner) {
        while (true) {
            System.out.println("Would you like to go again? Y/N");
            String againStr = scanner.nextLine();
                
            if (againStr.toUpperCase().equals("Y")) {
                return true;
            } else if (againStr.toUpperCase().equals("N")) {
                return false;
            } else {
                System.out.println("You did not submit a valid response.");
            }
        }
    }
}
