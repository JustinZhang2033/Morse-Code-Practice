//Language transfer to Morse Code and English
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class MorseDictionary {
    private static final HashMap<String, String> decoder = new HashMap<>();
    private static final HashMap<String, String> encoder = new HashMap<>();
    static final ArrayList<String> letters = new ArrayList<>();
    static final ArrayList<String> mcodes = new ArrayList<>();

    static {
        decoder.put(".-", "A");
        decoder.put("-...", "B");
        decoder.put("-.-.", "C");
        decoder.put("-..", "D");
        decoder.put(".", "E");
        decoder.put("..-.", "F");
        decoder.put("--.", "G");
        decoder.put("....", "H");
        decoder.put("..", "I");
        decoder.put(".---", "J");
        decoder.put("-.-", "K");
        decoder.put(".-..", "L");
        decoder.put("--", "M");
        decoder.put("-.", "N");
        decoder.put("---", "O");
        decoder.put(".--.", "P");
        decoder.put("--.-", "Q");
        decoder.put(".-.", "R");
        decoder.put("...", "S");
        decoder.put("-", "T");
        decoder.put("..-", "U");
        decoder.put("...-", "V");
        decoder.put(".--", "W");
        decoder.put("-..-", "X");
        decoder.put("-.--", "Y");
        decoder.put("--..", "Z");
        decoder.put("/", " ");

        for (Map.Entry<String, String> entry: decoder.entrySet()) {
            encoder.put(entry.getValue(), entry.getKey());
        }

        
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");
        letters.add("J");
        letters.add("K");
        letters.add("L");
        letters.add("M");
        letters.add("N");
        letters.add("O");
        letters.add("P");
        letters.add("Q");
        letters.add("R");
        letters.add("S");
        letters.add("T");
        letters.add("U");
        letters.add("V");
        letters.add("W");
        letters.add("X");
        letters.add("Y");
        letters.add("Z");
        letters.add(" ");

        mcodes.add(".-");
        mcodes.add("-...");
        mcodes.add("-.-.");
        mcodes.add("-..");
        mcodes.add(".");
        mcodes.add("..-.");
        mcodes.add("--.");
        mcodes.add("....");
        mcodes.add("..");
        mcodes.add(".---");
        mcodes.add("-.-");
        mcodes.add(".-..");
        mcodes.add("--");
        mcodes.add("-.");
        mcodes.add("---");
        mcodes.add(".--.");
        mcodes.add("--.-");
        mcodes.add(".-.");
        mcodes.add("...");
        mcodes.add("--");
        mcodes.add("..-");
        mcodes.add("...-");
        mcodes.add(".--");
        mcodes.add("-..-");
        mcodes.add("-.--");
        mcodes.add("--..");
        mcodes.add("/");
    }

    public static String decode(String code) {
        return decoder.get(code);
    }

    public static String encode(String text) {
        return encoder.get(text);
    }

    public static String encodeMessage(String m) {
        String[] mArr = m.split("");
        String encoder = "";
        String result = "";
        for (String s : mArr) {
            if (!(s.equals(" "))) {
                encoder = MorseDictionary.encode(s) + " ";
            } else {
                encoder = "/ ";
            }
            result += encoder;
        }
        return result;
    }
}