package aug.week1;

/**
 * Created by Gurupad Mamadapur on 02/08/20
 */
public class DetectCapital {

    public static boolean solve(String word) {
        final int length = word.length();
        if (length == 0) {
            return true;
        }

        char firstChar = word.charAt(0);

        if (isCapital(firstChar)) {
            if (!isCapital(word.charAt(length - 1))) {
                return !anyCapital(word.substring(1));
            } else {
                return allCapital(word);
            }
        } else {
            // make sure the next ones are not
            for (int i = 1; i < length; i++) {
                if (isCapital(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static Boolean anyCapital(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isCapital(word.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static Boolean allCapital(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!isCapital(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isCapital(char s) {
        return s >= 'A' && s <= 'Z';
    }
}
