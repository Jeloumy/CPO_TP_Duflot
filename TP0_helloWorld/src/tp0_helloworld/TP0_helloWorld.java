/*
 * TP0 Exercice
 * jerem
 * Septembre 2023
 */
package tp0_helloworld;

import java.util.Scanner;

/**
 *
 * @author jerem
 */
public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String prenom; 
        Scanner sc; 
        sc = new Scanner (System.in); 
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine(); 
        System.out.println("Bonjour " + prenom);
       
    }
}
