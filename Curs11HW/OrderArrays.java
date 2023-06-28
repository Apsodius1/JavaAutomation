package Curs11HW;

import java.util.Arrays;

public class OrderArrays {
    
    static <T> void sort(T[] obj) {
        Arrays.sort(obj);
        System.out.println(Arrays.toString(obj));
    }

    public static void main(String[] args) {
        String[] textArray = { "Alba", "Iasi", "Bacau", "Constanta" };
        Integer[] intArray = { 100, 500, 300, 400, 200 };
        Character[] charArray = { 'a', 'b', 'd', 'c' };
        sort(textArray);
        sort(intArray);
        sort(charArray);
    }

}
