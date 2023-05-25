package Curs6HW;

import java.util.Scanner;

class User {
    private int vechime;
    private int valoareaVanzarilor;
    private int lunaEfectuariiVanzarilor;

    public User() {
    }

    public User(int vechime, int valoareaVanzarilor, int lunaEfectuariiVanzarilor) {
        this.vechime = vechime;
        this.valoareaVanzarilor = valoareaVanzarilor;
        this.lunaEfectuariiVanzarilor = lunaEfectuariiVanzarilor;
    }

    private int bonus(int vechime, int valoareaVanzarilor, int lunaEfectuariiVanzarilor) {
        switch (vechime) {

            case 1:
                return 100;

            case 2:
                return 200;
            case 3:
                if (valoareaVanzarilor <= 5000) {
                    return 600;
                } else {
                    if (valoareaVanzarilor <= 10000) {
                        switch (lunaEfectuariiVanzarilor) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                return 800;

                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                return 1000;

                            case 12:
                                System.out.println("In decembrie se vand singure");
                                return 900;

                        }
                    } else {
                        return 1200;
                    }
                }
            default:
                break;
        }
        return 0;
    }

    public void inputData(Scanner input) {
        System.out.println("Introduceti va rog datele pentru a primi bonusul :)");
        System.out.print("Vechimea angajatului: ");
        this.vechime = input.nextInt();
        System.out.print("Valoarea vanzarilor efectuate: ");
        this.valoareaVanzarilor = input.nextInt();
        System.out.print("Luna in care au fost efectuate vanzarile: ");
        this.lunaEfectuariiVanzarilor = input.nextInt();
        System.out.println("Felicitari! Ati primit un bonus in valoare de: " + bonus(vechime, valoareaVanzarilor, lunaEfectuariiVanzarilor) + "RON");
    }

    public int getVechime() {
        return vechime;
    }

    public int getValoareaVanzarilor() {
        return valoareaVanzarilor;
    }

    public int getLunaEfectuariiVanzarilor() {
        return lunaEfectuariiVanzarilor;
    }
}

public class SwitchClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User Augustin = new User();
        Augustin.inputData(input);
        input.close();
    }
}