/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.bieres_duflot;

/**
 *
 * @author jerem
 */
public class BouteilleBiere {
String nom; 
float degreAlcool; 
String brasserie; 
boolean ouverte; 

    public BouteilleBiere(String unNom, float unDegre, String
    uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }
    
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Elle est Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}

public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
}

public void Decapsuler() {
    if (ouverte == false){
        ouverte = true; 
        System.out.println("pshhhht !! à la votre !!!");
    } else {
        System.out.println("Erreur : la bouteille est déjà ouverte");
    }
}
}


