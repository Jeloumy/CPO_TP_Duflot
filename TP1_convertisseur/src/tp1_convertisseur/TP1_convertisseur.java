/*
 * TP1 Exercice
 * jerem
 * Septembre 2023
 */
package tp1_convertisseur;

import java.util.Scanner;
/**
 *
 * @author jerem
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choix;

        System.out.println("Menu de conversion :");
        System.out.println("1. Celsius vers Kelvin");
        System.out.println("2. Kelvin vers Celsius");
        System.out.println("3. Fahrenheit vers Celsius");
        System.out.println("4. Celsius vers Fahrenheit");
        System.out.println("5. Kelvin vers Fahrenheit");
        System.out.println("6. Fahrenheit vers Kelvin");
        System.out.print("Choisissez une option (1-6) : ");
        choix = sc.nextInt();

        double resultat = 0.0;

        switch (choix) {
            case 1:
                System.out.print("Entrez la température en degrés Celsius : ");
                double celsius = sc.nextDouble();
                resultat = CelciusVersKelvin(celsius);
                System.out.println(celsius + " C en Kelvin = " + resultat);
                break;

            case 2:
                System.out.print("Entrez la température en Kelvin : ");
                double kelvin = sc.nextDouble();
                resultat = KelvinVersCelcius(kelvin);
                System.out.println(kelvin + " K en Celsius = " + resultat);
                break;

            case 3:
                System.out.print("Entrez la température en degrés Fahrenheit : ");
                double fahrenheit = sc.nextDouble();
                resultat = FarenheitVersCelcius(fahrenheit);
                System.out.println(fahrenheit + " F en Celsius = " + resultat);
                break;

            case 4:
                System.out.print("Entrez la température en degrés Celsius : ");
                double celsiusF = sc.nextDouble();
                resultat = CelciusVersFarenheit(celsiusF);
                System.out.println(celsiusF + " C en Fahrenheit = " + resultat);
                break;

            case 5:
                System.out.print("Entrez la température en Kelvin : ");
                double kelvinF = sc.nextDouble();
                resultat = KelvinVersFarenheit(kelvinF);
                System.out.println(kelvinF + " K en Fahrenheit = " + resultat);
                break;

            case 6:
                System.out.print("Entrez la température en degrés Fahrenheit : ");
                double fahrenheitK = sc.nextDouble();
                resultat = FarenheitVersKelvin(fahrenheitK);
                System.out.println(fahrenheitK + " F en Kelvin = " + resultat);
                break;

            default:
                System.out.println("Option invalide.");
        }

        sc.close();
    }
    
    
    // Méthode de conversion 
public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5/9;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9/5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        // Conversion Kelvin vers Fahrenheit en utilisant les conversions précédentes
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFahrenheit) {
        // Conversion Fahrenheit vers Kelvin en utilisant les conversions précédentes
        return CelciusVersKelvin(FarenheitVersCelcius(tFahrenheit));
    }
}
