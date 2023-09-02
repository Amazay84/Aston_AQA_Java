public class SplitText {
    public static void main(String[] args) {
        String gigatext = "Everyone could notice that people often complain and say that it was better before. It may be a little nostalgia;\n" +
                "the old people would like to return in the 50, forty years old people prefer the 70.\n" +
                "It can be explained of the life period when they were younger. As its known people like their youth time.\n" +
                "In general living is better now. We live when there arent as many wars in the world as before. And\n" +
                "people live longer; the level of lifespan is higher than it was 40 years ago. People work less and they\n" +
                "can afford to go to the vacation and buy more things.\n" +
                "So, it is true that there is more pollution now than in the last century but there is more conveniences.\n" +
                "Everyone has a shower, a TV, a fridge, a computer, etc. And now there are more means of communication\n" +
                "than before. Earlier it was dangerous to travel and it was almost impossible to go around the world.\n" +
                "Someone say that people were kinder before. But now people are more educated and now everyone has an\n" +
                "opportunity to go to school and to get education. Its better to think of advantages to live in the\n" +
                "modern world than to regret something that no longer exists.";
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
                if (splitText[i].isEmpty() || splitText[i].matches("\\n") || splitText[i].matches("\\s")) {
                    continue;
                } else {
                    sb.append(splitText[i].trim()).append(System.lineSeparator());
                }
            }
        }
        return sb.toString();
    }
}
