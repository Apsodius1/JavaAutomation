package Curs10HW;

import java.util.HashMap;
import java.util.Scanner;

//catalog
// un nume si o nota de elev
// intrebam elevul cum il cheama si ce nota a luat
// daca nu este in lista il adaugam si printam: "Nu aveai nota, ti-am trecut acum"
// daca nota noua este mai mica decat cea veche: "Nu ai nevoie de alta nota" 
// daca nota noua este mai mare decat cea veche updatam
// map
public class Catalog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> catalog = new HashMap<>();

        catalog.put("Augustin", 10);
        catalog.put("Alex", 8);
        catalog.put("Andrei", 6);
        catalog.put("Maria", 9);
        catalog.put("George", 4);

        System.out.println(catalog);

        System.out.print("Introduceti numele: ");
        String nume = input.nextLine();
        System.out.print("Nota obtinuta: ");
        Integer nota = input.nextInt();

        if (catalog.containsKey(nume)) {
            if (nota > catalog.get(nume)) {
                catalog.replace(nume, nota);
                System.out.println("Nota a fost actualizata");
            } else {
                System.out.println("Nu ai nevoie de alta nota");
            }
        } else {
            catalog.put(nume, nota);
            System.out.println("Nu aveai nota, ti-am trecut acum");
        }

        System.out.println(catalog);

    }
}
