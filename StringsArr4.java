import java.util.Scanner;

public class StringsArr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberTel = scanner.nextLine();
        System.out.println("Number: " + number(numberTel));
    }

    public static String number(String numberTel) {
        String pattern = "050";
        String pattern2 = "050-";
        String pattern3 = "97250";
        String nahonNumber;
        if (numberTel.length() == 10 && numberTel.contains(pattern)){
            nahonNumber = numberTel.replace(pattern, pattern2);
        } else if (numberTel.length() == 11 && numberTel.contains(pattern2)) {
            nahonNumber = numberTel;
        } else if (numberTel.length() == 12 && numberTel.contains(pattern3)) {
            nahonNumber = numberTel.replace(pattern3, pattern2);
        } else {
            nahonNumber = "   ";
        }
        return nahonNumber;
    }
}