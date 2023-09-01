import java.util.ArrayList;
import java.util.List;

public class SequentialWordsNumbers {
    public static String sequentialWordsNumbers(String text) {

        StringBuilder stringBuilder = new StringBuilder();
        int spaceCount = 1;
        String result = "";
        String temp = text.trim() + " ";
        if (text.isEmpty()) {
            return "";
        }
        else {
            for (int i = 0; i < temp.length(); i++) {
                if (temp.length() <= 2 && !Character.isLetter(temp.charAt(i))) {
                    result = "";
                }
                if (temp.charAt(i) != ' ' && temp.length() > 2) {
                    result += temp.charAt(i);
                } else {
                    stringBuilder.append(" (" + spaceCount++ + ") " + result);
                    result = "";
                }
            }
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(SequentialWordsNumbers.sequentialWordsNumbers("aaaa bbbbbbb cccccccc dddddd eeeee ffff"));
    }


}
