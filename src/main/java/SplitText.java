public class SplitText {
    public static void main(String[] args) {
        String gigatext = "A regular expression is a special sequence of characters that helps in matching or finding other strings or sets of strings, using a specialized syntax held in a pattern. Java has support for regular expression usage through the java.util.regex (opens new window)package. This topic is to introduce and help developers understand more with examples on how Regular Expressions must be used in Java.A regular expression is a special sequence of characters that helps in matching or finding other strings or sets of strings, using a specialized syntax held in a pattern. Java has support for regular expression usage through the java.util.regex (opens new window)package. This topic is to introduce and help developers understand more with examples on how Regular Expressions must be used in Java.";
        System.out.println(splitTextIntoWords(gigatext));
    }

    public static String splitTextIntoWords(String text) {
        String filteredText = text.replaceAll("[^A-Za-z\\s]", "");
        String[] splitText = filteredText.split(" ");
        StringBuilder sb = new StringBuilder();

        if (text.isEmpty() || splitText.length < 100) {
            return "";
        } else {
            for (int i = 0; i < splitText.length; i++) {
                sb.append(splitText[i]).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
