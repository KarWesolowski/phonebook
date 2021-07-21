import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Management {
    private final static Pattern PHONE_NUMBER_PATTERN = Pattern.compile("(\\+48)?\\d{3}-\\d{3}-\\d{3}");

    private Set<String> phoneBook = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void addPhoneNumber() {
        System.out.println("Podaj numer telefonu: (000-000-000)");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            phoneBook.add(phoneNumber);
        } else {
            System.out.println("Błędnie podany numer");
        }
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        Matcher matcher = PHONE_NUMBER_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }

    public void displayPhoneBook() {
        for (String phoneNumber : phoneBook) {
            System.out.println(phoneNumber);
        }
    }


}
