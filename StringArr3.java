import java.util.Scanner;

public class StringArr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        System.out.println("Is equals: " + isEquals(firstString, secondString));
    }

    public static boolean isEquals(String firstString, String secondString) {
        boolean isEquals = true;

        for (int i = 0; i < firstString.length() && i < secondString.length(); i++) {
            if (firstString.length() == secondString.length()){
                if (firstString.charAt(i) != secondString.charAt(i)) {
                    isEquals = false;
                }
            } else {
                isEquals = false;
                break;
            }
        }
        return isEquals;
    }
}