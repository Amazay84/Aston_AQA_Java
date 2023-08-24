import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public void printThreeWords(ArrayList<? super String> list) {
        list.stream().forEach(System.out::println);
    }
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>(Arrays.asList("Orange", "Banana", "Apple"));
        Main main = new Main();
        main.printThreeWords(list);
    }
}
