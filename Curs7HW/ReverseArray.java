package Curs7HW;

import java.util.Scanner;

public class ReverseArray {
    static int[] citire() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cate elemente trebuie sa aiba array-ul:  ");
        Integer lungime = input.nextInt();
        int[] array = new int[lungime];
        for (int i = 0; i < lungime; i++) {
            System.out.print("Introdu elementul " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        input.close();
        return array;
    }

    static void reverse(int a[]) {
        int c;
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            c = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = c;
        }
        System.out.print("Array reversed: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void rereverse(int a[]) {
        int c;
        int n = a.length;
        int i = 0;
        while (i < n / 2) {
            c = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = c;
            i++;
        }
        System.out.print("Array rereversed: ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = citire();
        reverse(array);
        rereverse(array);
    }
}
