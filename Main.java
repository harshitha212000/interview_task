import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactNumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the contact number");
        String contactNumber = sc.nextLine();
        Pattern pattern = Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{10}$");
        Matcher matcher = pattern.matcher(contactNumber);
        if (matcher.matches()) {
            System.out.println("Valid contact number");
        } else {
            System.out.println("Invalid contact number");
        }
    }
}