import java.util.Scanner;

public class PhoneCleanerRegex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            String cleanNumber = input.replaceAll("[^0-9]", "");
            if (cleanNumber.length() > 11 || cleanNumber.length() < 10) {
                System.out.println("Неверный формат номера");
                break;
            } else if (cleanNumber.length() == 10) {
                System.out.println("7".concat(cleanNumber));
                break;
            } else if (cleanNumber.charAt(0) == '8') {
                cleanNumber = cleanNumber.replace(cleanNumber.charAt(0), '7');
                System.out.println(cleanNumber);
                break;
            } else if (cleanNumber.charAt(0) == '9') {
                System.out.println("Неверный формат номера");
                break;
            }
            System.out.println(cleanNumber);
            break;
        }
    }
}
