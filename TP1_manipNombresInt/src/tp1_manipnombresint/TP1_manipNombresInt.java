/*
 * TP1 Exercice
 * jerem
 * Septembre 2023
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author jerem
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // initialisation des variables
    int nb; 
    int nb2; 
    int resultatAddition; 
    int resultatSoustraction; 
    int resultatProduit; 
    int resultatDivision;
    int reste; 
    
    // Définir les nombres 
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrer le nombre nb :");
    nb=sc.nextInt();
    
    System.out.println("Entrer le nombre nb2 :");
    nb2=sc.nextInt();
    
    
    // resultat addition
    resultatAddition = nb + nb2;
    // affichage du resultat
    System.out.println("la somme de "+ nb + " et " + nb2 + " entiers est: "+ resultatAddition); 
    
    // resultat soustraction
    resultatSoustraction = nb - nb2;
    // affichage du resultat
    System.out.println("la soustraction dee "+ nb + " et " + nb2 +  " entiers est: "+ resultatSoustraction); 
     
    // resultat produit
    resultatProduit = nb * nb2;
    // affichage du resultat
    System.out.println("la somme de "+ nb +  " et " + nb2 + " entiers est: "+ resultatProduit); 
    
    // resultat division
    resultatDivision = nb / nb2;
    reste = nb % nb2;
    // affichage du resultat
    System.out.println("la division de "+ nb +  " et " + nb2 + " entiers est: "+ resultatDivision + " le reste est: " + reste); 
    }
    
}
