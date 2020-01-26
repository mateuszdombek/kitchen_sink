package excercises;

public final class CountCharactersUtil {
    private CountCharactersUtil() {
    }

    public static int count(String string) {
        int count = 0;

        //Counts each character except space
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        return count;
    }
}
