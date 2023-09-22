/*
 * TP1 Exercice
 * jerem
 * Septembre 2023
 */

package tp1_stats;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jerem
 */


/**
 *
 * @author jerem
 */
public class TP1_stats {

    public static void main(String[] args) {
        // Créez un tableau de 6 entiers pour représenter les faces du dé
        int[] des = new int[6];

        // Initialisez toutes les cellules du tableau à 0
        for (int i = 0; i < 6; i++) {
            des[i] = 0;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt();
    }
}
