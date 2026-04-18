//Language transfer to Morse Code and English
import java.util.HashMap;
import java.util.Map;

public class MorseDictionary {
    private static final HashMap<String, String> decoder = new HashMap<>();
    private static final HashMap<String, String> encoder = new HashMap<>();
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
    }

    public static String decode(String code) {
        return decoder.get(code);
    }

    public static String encode(String text) {
        return encoder.get(text);
    }
}