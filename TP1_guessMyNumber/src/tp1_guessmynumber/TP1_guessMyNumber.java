/*
 * TP1 Exercice
 * jerem
 * Septembre 2023
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jerem
 */
public class TP1_guessMyNumber {

    public static void main(String[] args) {
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        int nombreJoueur;
        boolean gagne = false;
        int tentatives = 0;
        int limiteTentatives = 0; // Limite de tentatives en fonction du niveau de difficulté
        int minNombre = 0; // Valeur minimale du nombre à deviner
        int maxNombre = 100; // Valeur maximale du nombre à deviner
        boolean modeCauchemar = false;

        System.out.println("Bienvenue dans le jeu Guess My Number!");
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile (nombre entre 0 et 50, 10 tentatives)");
        System.out.println("2. Normal (nombre entre 0 et 100, 7 tentatives)");
        System.out.println("3. Difficile (nombre entre 0 et 200, 5 tentatives)");
        System.out.println("4. Cauchemar (nombre entre 0 et 200, 5 tentatives)");
        int choixDifficulte = sc.nextInt();

        // Configuration en fonction du niveau de difficulté
        switch (choixDifficulte) {
            case 1:
                maxNombre = 50;
                limiteTentatives = 10;
                break;
            case 2:
                maxNombre = 100;
                limiteTentatives = 7;
                break;
            case 3:
                maxNombre = 200;
                limiteTentatives = 5;
                break;
            case 4:
                maxNombre = 200;
                limiteTentatives = 5;
                modeCauchemar = true;
                break;
            default:
                System.out.println("Niveau de difficulté invalide. Difficulté normale choisie par défaut.");
                break;
        }

        int n = generateurAleat.nextInt(maxNombre + 1);

        System.out.println("Devinez le nombre entre 0 et " + maxNombre + ".");

        while (!gagne && tentatives < limiteTentatives) {
            System.out.println("Tentative #" + (tentatives + 1));
            System.out.println("Entrer un nombre entre 0 et " + maxNombre + ":");
            nombreJoueur = sc.nextInt();
            tentatives++;

            if (modeCauchemar && generateurAleat.nextDouble() < 0.3) {
                // Fausse indication
                if (generateurAleat.nextBoolean()) {
                    System.out.println("Votre nombre est trop petit !");
                } else {
                    System.out.println("Votre nombre est trop grand !");
                }
            } else {
                if (nombreJoueur < n) {
                    System.out.println("Votre nombre est trop petit !");
                } else if (nombreJoueur > n) {
                    System.out.println("Votre nombre est trop grand !");
                } else {
                    System.out.println("Gagné ! Le nombre était " + n);
                    System.out.println("Nombre de tentatives : " + tentatives);
                    gagne = true;
                }
            }
        }
        if (!gagne) {
            System.out.println("Désolé, vous avez atteint la limite de tentatives. Le nombre était " + n);
        }

        sc.close();
    }
}
