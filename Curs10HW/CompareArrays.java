package Curs10HW;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrays {
   public static void main(String[] args) {
      ArrayList<String> firstList = new ArrayList<>(
            Arrays.asList("Product1", "Product2", "Product3", "Product4", "Product5"));
      ArrayList<String> secondList = new ArrayList<>(
            Arrays.asList("Product1", "Product2", "Product6", "Product4", "Product8"));
      System.out.println(firstList);
      System.out.println(secondList);
      ArrayList<Boolean> containArrayList = new ArrayList<>();
      for (String i : firstList) {
         if (secondList.contains(i)) {
            containArrayList.add(true);
         } else {
            containArrayList.add(false);
         }
      }
      System.out.println(containArrayList);
   }
}
