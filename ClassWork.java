import java.util.Random;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        char[] arr = {'q', 'w', 'e', 'r', 't', 'y'};
        char toFind = 'r';
        char original = 'e';
        char replacement = 'S';
        System.out.println("Index: " + indexOf(arr, toFind));
        System.out.println("Duplicates: " + hasDuplicates(arr));
        System.out.println("Duplicates: " + replace(arr, original, replacement));
    }

    public static int indexOf(char[] arr, char toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (toFind == arr[i]) {
                return i;
            } else if (toFind != arr[i] && i == arr.length - 1) {
                return -1;
            }
        }
        return -1;
    }

    public static boolean hasDuplicates(char[] arr) {
        boolean isDuplicates = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i && j != i) {
                    isDuplicates = false;
                }
            }
        }
        return isDuplicates;
    }

    public static char[] replace(char[] arr, char original, char replacement) {
        char[] newArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == original) {
                newArr[i] = replacement;
            } else {
                newArr[i] = arr[i];
            }
            System.out.print(newArr[i] + " ");
        }
        return newArr;
    }
}
