import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        final int AMOUNT_INDEX = 5;
        int[] array = new int[AMOUNT_INDEX];
        int numInput = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            array[numInput] = scanner.nextInt();
            numInput++;
        } while (numInput < AMOUNT_INDEX);

        int addNumber = scanner.nextInt();
        typeElements(array);
        System.out.println();

        boolean isInArray = findElement(array, addNumber);
        System.out.println(isInArray);

        int sumEvenElements = evenElements(array);
        System.out.println(sumEvenElements);

        int sumOfEvenElements = sumOfEvenElements(array);
        System.out.println(sumOfEvenElements);

        boolean isDouble = isDouble(array);
        System.out.println(isDouble);
    }

    public static void typeElements(int[] array) {
        for (int j : array) {
            System.out.print(j + ", ");
        }
    }

    public static boolean findElement(int[] array, int addNumber) {
        boolean isInArray = false;
        for (int j : array) {
            if (j == addNumber) {
                isInArray = true;
                break;
            }
        }
        return isInArray;
    }

    public static int evenElements(int[] array) {
        int sumEvenElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEvenElements += array[i];
            }
        }
        return sumEvenElements;
    }

    public static int sumOfEvenElements(int[] array) {
        int sumOfEvenElements = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                sumOfEvenElements += j;
            }
        }
        return sumOfEvenElements;
    }

    public static boolean isDouble(int[] array) {
        boolean isDouble = false;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] == array[j] && i != j) {
                    isDouble = true;
                    break;
                }
            }
        }
        return isDouble;
    }
}