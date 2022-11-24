import java.util.Scanner;

public class StringsArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        System.out.println(returnName(firstName, secondName));
    }

    public static String returnName (String firstName, String secondName) {
        String fullName;
        fullName = firstName + " " + secondName;
        return fullName;
    }
}
