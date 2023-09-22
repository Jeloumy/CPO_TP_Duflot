/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.bieres_duflot;

/**
 *
 * @author jerem
 */
public class TP2Bieres_Duflot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson");
        uneBiere.ouverte = true;
        uneBiere.Decapsuler();
        uneBiere.lireEtiquette();
        System.out.println(uneBiere) ;
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        autreBiere.Decapsuler();
        System.out.println(autreBiere) ;
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe de Noël", (float) 6.6,"Abbaye de Leffe") ;
        deuxBiere.Decapsuler();
        System.out.println(deuxBiere);
        
        BouteilleBiere troisBiere = new BouteilleBiere("Bock", (float) 8.0,"Allez l'OL !") ;
        troisBiere.Decapsuler();
        System.out.println(troisBiere);
        
        BouteilleBiere quatreBiere = new BouteilleBiere("Milk Stout", (float) 8.0,"Le Bar de Sasha") ;
        //quatreBiere.lireEtiquette();
        //quatreBiere.Decapsuler();
    
    }
    
}
