/*
 * TP0 Exercice
 * jerem
 * Septembre 2023
 */
package tp0_additionp;
import java.util.Scanner;
/**
 *
 * @author jerem
 */
public class TP0_additionp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb; // nombre d'entiers à additionner
int result; // resultat
int ind; //indice

Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre :");
nb=sc.nextInt();
// initialisation

result=0;
// addition des nb premiers entiers
ind=1;
while (ind< nb) {
 result=result+ind;
 ind++;
}
// affichage du resultat
System.out.println("la somme des "+ nb + " entiers est: "+result); 
    }
    
}
