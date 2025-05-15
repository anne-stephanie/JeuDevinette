
import java.util.Random;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreSecret = random.nextInt(100) + 1;
        int tentative = 0;
        boolean gagne = false;

        System.out.println(" Bienvenue dans le jeu de devinettes !");
        System.out.println("Devinez le nombre entre 1 et 100. Vous avez 10 essais.");

        while (tentative < 10) {
            System.out.print("Essai " + (tentative + 1) + ": ");
            int proposition = scanner.nextInt();
            tentative++;

            if (proposition == nombreSecret) {
                System.out.println(" Bravo ! Vous avez deviné le bon nombre en " + tentative + " essai(s).");
                gagne = true;
                break;
            } else if (proposition < nombreSecret) {
                System.out.println(" Trop petit !");
            } else {
                System.out.println(" Trop grand !");
            }
        }

        if (!gagne) {
            System.out.println(" Désolé, vous avez épuisé vos 10 essais. Le nombre était : " + nombreSecret);
        }

        scanner.close();

    }
}