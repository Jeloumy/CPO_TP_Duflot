/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_duflot;
import java.util.Scanner;
/**
 *
 * @author jerem
 */
public class TP2_convertisseurObjet_Duflot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int choix;
       
        Convertisseur c = new Convertisseur(); 
        
       do 
       {System.out.println("Menu de conversion :");
        System.out.println("1. Celsius vers Kelvin");
        System.out.println("2. Kelvin vers Celsius");
        System.out.println("3. Fahrenheit vers Celsius");
        System.out.println("4. Celsius vers Fahrenheit");
        System.out.println("5. Kelvin vers Fahrenheit");
        System.out.println("6. Fahrenheit vers Kelvin");
        System.out.println("7. Quitter");
        System.out.print("Choisissez une option (1-6) : ");
        choix = sc.nextInt();
        
        if (choix < 1 || choix > 7) {
                System.out.println("Choix invalide.");
                continue;
       }
        double resultat = 0.0;
        boolean continuer = true;
        

        switch (choix) {
            case 1:
                System.out.print("Entrez la température en degrés Celsius : ");
                double celsius = sc.nextDouble();
                resultat = c.CelciusVersKelvin(celsius);;
                System.out.println(celsius + " C en Kelvin = " + resultat);
                System.out.println(c);
                break;

            case 2:
                System.out.print("Entrez la température en Kelvin : ");
                double kelvin = sc.nextDouble();
                resultat = c.KelvinVersCelcius(kelvin);
                System.out.println(kelvin + " K en Celsius = " + resultat);
                System.out.println(c);
                break;

            case 3:
                System.out.print("Entrez la température en degrés Fahrenheit : ");
                double fahrenheit = sc.nextDouble();
                resultat = c.FarenheitVersCelcius(fahrenheit);
                System.out.println(fahrenheit + " F en Celsius = " + resultat);
                System.out.println(c);
                break;

            case 4:
                System.out.print("Entrez la température en degrés Celsius : ");
                double celsiusF = sc.nextDouble();
                resultat = c.CelciusVersFarenheit(celsiusF);
                System.out.println(celsiusF + " C en Fahrenheit = " + resultat);
                System.out.println(c);
                break;

            case 5:
                System.out.print("Entrez la température en Kelvin : ");
                double kelvinF = sc.nextDouble();
                resultat = c.KelvinVersFarenheit(kelvinF);
                System.out.println(kelvinF + " K en Fahrenheit = " + resultat);
                System.out.println(c);
                break;

            case 6:
                System.out.print("Entrez la température en degrés Fahrenheit : ");
                double fahrenheitK = sc.nextDouble();
                resultat = c.FarenheitVersKelvin(fahrenheitK);
                System.out.println(fahrenheitK + " F en Kelvin = " + resultat);
                System.out.println(c);
                break;

            case 7:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        } while (choix != 7); // Répéter tant que l'utilisateur ne choisit pas de quitter
    }
}