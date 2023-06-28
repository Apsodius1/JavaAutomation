package Curs11HW;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Calorii {
    String path = "./Curs11HW", numeFis = "properties.txt";
    File dataFile = new File(path, numeFis);

    void newFile() {

        try {
            dataFile.createNewFile();
            // Scriem in fisier
            FileWriter dataFileWriter = new FileWriter(path + "/" + numeFis);
            dataFileWriter.write("morcov=25\n");
            dataFileWriter.write("ardei=20\n");
            dataFileWriter.write("ceapa=34\n");
            dataFileWriter.write("ciuperca=1\n");
            dataFileWriter.write("cartof=164\n");
            dataFileWriter.close();

        } catch (Exception e) {

        }
    }

    void getCalories() {

        Scanner in = new Scanner(System.in);
        System.out.println("Ce leguma doriti sa cumparati?");
        String leguma = in.nextLine();
        Boolean gasit = false;
        
        try {

            Scanner scanner = new Scanner(dataFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(leguma)) {
                    String X = line.substring(line.indexOf("=") + 1);
                    System.out.println("Leguma aleasa de tine are " + X + " calorii");
                    gasit = true;
                }
            }

            if (gasit == false) {
                System.out.println("Nu vindem aceasta leguma");
                getCalories();
            }

            in.close();
            scanner.close();

        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {

        // Cream un obiect al clasei
        Calorii c = new Calorii();
        // newFile() este metoda specifica clasei asa ca o chemam pe obiectul clasei
        c.newFile();
        c.getCalories();
    }
}
