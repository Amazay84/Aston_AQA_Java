import FirstTask.PrintThreeWords;
import SecondTask.CheckSumSign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>(Arrays.asList("Orange", "Banana", "Apple"));
        PrintThreeWords print = new PrintThreeWords();
        print.printThreeWords(list);
        System.out.println("------------------------------------------------------------------------------------------");

        CheckSumSign checkSumSign = new CheckSumSign();
        checkSumSign.checkSumSign();

    }
}
