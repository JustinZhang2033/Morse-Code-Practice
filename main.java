//Morse code practice website
//@Justin Zhang
//04/17/2026
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String input = "";
        String translatedMessage = "";
        String addedEncoder = "";

        System.out.print("Would you like to encode or decode? (E/D)");
        String type = scanner.nextLine();

        if (type.equals("E") || type.equals("e")) {
            System.out.println("What would you like to encode?");
            input = scanner.nextLine().toUpperCase();
            String[] message = input.split("");

            for (String s : message) {
                if (!(s.equals(" "))) {
                    addedEncoder = MorseDictionary.encode(s) + " ";
                } else {
                    addedEncoder = MorseDictionary.encode(s);
                }
                translatedMessage += addedEncoder;
            }
        } else if (type.equals("D") || type.equals("d")) {
            System.out.println("What would you like to decode?");
            input = scanner.nextLine();
            String[] message = input.split(" ");

            for (String s : message) {
                translatedMessage += MorseDictionary.decode(s.toUpperCase());
            }
        }

        System.out.println(translatedMessage);
    }
}