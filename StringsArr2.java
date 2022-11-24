import java.util.Scanner;

public class StringsArr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        returnLongest(firstString, secondString);
    }

    public static void returnLongest (String firstString, String secondString) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < firstString.length();i++){
            count1++;
        }
        for (int i = 0; i < secondString.length();i++){
            count2++;
        }
        if (count1 > count2) {
            System.out.println(firstString);
        } else if (count2> count1) {
            System.out.println(secondString);
        } else {
            System.out.println("There is no longest string, them equals");
        }
    }
}