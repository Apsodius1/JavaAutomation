package Curs7HW;

import java.util.Scanner;

public class EvenNumbers {
    static int[] inputNumbers(int size) {
        System.out.println("You are going to input " + size + " numbers.");
        Scanner input = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "/" + size + ": ");
            array[i] = input.nextInt();
        }
        input.close();
        return array;
    }

    static void evenNumbers(int[] array) {

        System.out.println("Even numbers: ");
        for (int i : array) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void evenNumbersWithWhile(int[] array) {
        System.out.println("Even numbers: ");
        int i = 0;
        while (i < array.length) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 10;
        int[] array = inputNumbers(size);
        evenNumbers(array);
        evenNumbersWithWhile(array);
    }
}
