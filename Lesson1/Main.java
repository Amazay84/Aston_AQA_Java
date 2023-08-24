import FirstTask.PrintThreeWords;
import FourthTask.CompareNumbers;
import SecondTask.CheckSumSign;
import ThirdTask.PrintColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintThreeWords print = new PrintThreeWords();
        print.printThreeWords();
        System.out.println("------------------------------------------------------------------------------------------");

        CheckSumSign checkSumSign = new CheckSumSign();
        checkSumSign.checkSumSign();
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Введите произвольное отрицательное или положительное число!");
        int value = new Scanner(System.in).nextInt();
        PrintColor printColor = new PrintColor();
        PrintColor printColor1 = new PrintColor(value);
        System.out.print("Тут у нас псевдорандом... ");
        printColor.printColor();
        System.out.print("То, что мы ввели... ");
        printColor1.printColor();
        System.out.println("------------------------------------------------------------------------------------------");

        CompareNumbers compareNumbers = new CompareNumbers();
        compareNumbers.compareNumbers();

    }
}
