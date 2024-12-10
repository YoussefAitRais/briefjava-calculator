import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        showMenu();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer Nomber a");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entrer Nomber b");
        int num2 = scanner.nextInt();
        scanner.nextLine();

//        int sum = num1 + num2;
//        System.out.printf("la somme est %d ", sum);
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                System.out.println("Addition");
                break;

            case 2:
                System.out.println("Soustraction");
                break;

            case 3:
                System.out.println("Multiplication");
                break;

            case 4:
                System.out.println("Division");
                break;

            case 5:
                System.out.println("Puissance");
                break;

            case 6:
                System.out.println("Racine carrée");
                break;

            case 7:
                System.out.println("Factorielle");
                break;
        }
    }

    static void showMenu () {
        System.out.println("-----------------MENU--------------------");
        System.out.println("addition => 1");
        System.out.println("Soustraction => 2");
        System.out.println("Multiplication => 3");
        System.out.println("Puissance => 4");
        System.out.println("Racine carrée => 5");
        System.out.println("Factorielle => 6");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir le nombre");

        int menunum = scanner.nextInt();
        scanner.nextLine();




    };
}







