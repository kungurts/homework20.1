import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
            " ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud" +
            " exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis" +
            " aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu" +
            " fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident," +
            " sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> letters = new HashMap<>();
        char maxLetter = ' ', minLetter = ' ';
        int max = -1, quantity = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < loremIpsum.length(); i++) {
            char x = loremIpsum.charAt(i);
            if (Character.isLetter(x)) {
                char lowX = Character.toLowerCase(x);
                if (letters.containsKey(lowX)) {
                    letters.put(lowX, (letters.get(lowX) + 1));
                } else {
                    letters.put(lowX, 1);
                }
            }
        }
        System.out.println(letters);

        for (Map.Entry<Character, Integer> sq : letters.entrySet()) {
            quantity = sq.getValue();
            if (quantity > max) {
                max = quantity;
                maxLetter = sq.getKey();
            }
            if (quantity < min) {
                min = quantity;
                minLetter = sq.getKey();
            }
        }

        System.out.println("Самая часто встречающаяся буква: " + maxLetter);
        System.out.println("Самая редко встречающаяся буква: " + minLetter);

    }
}
