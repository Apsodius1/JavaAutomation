package Curs13HW;

import java.util.regex.Pattern;

public class Lipsum {
    static void printLine() {
        System.out.println("---------------------------------");
    }

    // 1
    static void numberOfNulla(String text, String word) {
        printLine();
        printLine();
        System.out.println("The word '" + word + "' appears "
                + Pattern.compile(word + " ").matcher(text).results().count() + " times");
    }

    // 2
    static void splitSentences(String text) {
        printLine();
        printLine();
        System.out.println("The text split in sentences:");
        printLine();

        int indexOfDot = text.indexOf(".") + 1;
        System.out.println(text.substring(0, indexOfDot));
        text = text.substring(indexOfDot, text.length());

        while (text != "") {
            indexOfDot = text.indexOf(".") + 1;
            System.out.println(text.substring(1, indexOfDot));
            text = text.substring(indexOfDot, text.length());
        }
        String[] split = text.split(".");
        for (String i : split) {
            System.out.println(i);
        }
    }

    // 3
    static void deleteChar(String text, String letter) {
        printLine();
        printLine();
        StringBuilder str = new StringBuilder(text);
        while (str.indexOf(letter) != -1) {
            str = str.deleteCharAt(str.indexOf(letter));
        }
        System.out.println("Text without the letter '" + letter + "':");
        printLine();
        System.out.println(str);
    }

    // 4
    static void replaceChar(String text, String toReplace, String replaceWith) {
        printLine();
        printLine();
        StringBuilder str = new StringBuilder(text);
        while (str.indexOf(toReplace) != -1) {
            str = str.replace(str.indexOf(toReplace), str.indexOf(toReplace) + 1, replaceWith);
        }
        System.out.println("Text with'" + toReplace + "' instead of '" + replaceWith + "':");
        printLine();
        System.out.println(str);
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
        numberOfNulla(text, "Nulla");
        splitSentences(text);
        deleteChar(text, "a");
        replaceChar(text, "o", "#");
    }

}
