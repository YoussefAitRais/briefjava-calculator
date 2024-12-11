import java.util.Scanner;


import static java.lang.Math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static Scanner scanner = new Scanner(System.in);
    static int num1,num2;

    public static void main(String[] args) {

        showMenu();
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                insert();
                System.out.println("Résultat de l'addition : " + addition(num1, num2));
                break;

            case 2:
                insert();
                System.out.println(" LA Resultat de soustraction : " + soustraction(num1,num2));
                break;

            case 3:
                insert();
                System.out.println(" la resultat de multiplication : " + multiplication(num1,num2));

                break;

            case 4:
                insert();
                System.out.println(" la resultat de division : " + division(num1,num2));
                break;

            case 5:
                insert();
                System.out.println(" la resultat de puissance : " + puissance(num1,num2));
                break;

            case 6:
                System.out.println("Entrer le nombre");
                int num = scanner.nextInt();
                System. out. println("Square root of " + num + " is " + sqrt (num));

                break;

            case 7:
                System.out.println("Entrer le nombre");
                int nume = scanner.nextInt();
                System. out. println("factorial  is " + factorial (nume));
                break;
        }
    }

    static void showMenu () {
        System.out.println("-----------------MENU--------------------");

        System.out.println("addition => 1");
        System.out.println("Soustraction => 2");
        System.out.println("Multiplication => 3");
        System.out.println("Division => 4");
        System.out.println("Puissance => 5");
        System.out.println("Racine carrée => 6");
        System.out.println("Factorielle => 7");
        System.out.println("-------------------------");
        System.out.println("Choisir le nombre de MENU : ");
        System.out.println("-------------------------");
    }

    static void insert() {


        System.out.println("Entre le nombre : ");
        num1 = scanner.nextInt();
        System.out.println("Entrer le deuxieme nombre :");
        num2 = scanner.nextInt();

    }

    static int addition (int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static int  soustraction (int num1, int num2) {
        int sous = num1 - num2;
        return sous;

    }

    static int  multiplication (int num1, int num2) {
        int div = num1 * num2;
        return div;

    }


    static int  division (int num1 , int num2) {
        int div = num1 / num2;
        return div;

    }

    static double  puissance (int base , int exponent) {
        double puis =  pow(base, exponent);
        return puis;
    }

    static double  sqrt (int num1) {
        double result = Math. sqrt(num1);

        return result;
    }

    static int  factorial (int num1) {

        for ( int i = num1 - 1 ; i > 0 ; i--) {
            num1 = num1 * i;
        }

        return num1;
    }
}







