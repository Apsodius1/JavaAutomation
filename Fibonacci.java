import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lungimea sirului: ");
        Integer lungime = input.nextInt();

        // Cu for:
        ArrayList<Integer> FibonacciFor = new ArrayList<Integer>(List.of(0, 1));
        for (Integer i = 2; i < lungime; i++) {
            FibonacciFor.add(FibonacciFor.get(i - 1) + FibonacciFor.get(i - 2));
        }
        System.out.println("Sirul lui Fibonacci de lungime " + lungime + " este: " + FibonacciFor);

        // Cu while:
        ArrayList<Integer> FibonacciWhile = new ArrayList<Integer>(List.of(0, 1));
        while (FibonacciWhile.size() < lungime) {
            FibonacciWhile
                    .add(FibonacciWhile.get(FibonacciWhile.size() - 1) + FibonacciWhile.get(FibonacciWhile.size() - 2));
        }
        System.out.print("Sirul lui Fibonacci de lungime " + lungime + " este: ");
        for (Integer i : FibonacciWhile) {
            System.out.print(i + " ");
        }

        input.close();
    }
}