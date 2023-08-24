package FirstTask;

import java.util.ArrayList;

public class PrintThreeWords {
    public void printThreeWords(ArrayList<? super String> list) {
        list.stream().forEach(System.out::println);
    }
}
