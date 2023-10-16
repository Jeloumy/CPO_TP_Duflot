/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_duflot;

/**
 *
 * @author jerem
 */
public class Convertisseur {
 int nbConversions; 
   
 public Convertisseur () {
 nbConversions = 0; 
 }
 
    // Méthode de conversion 
public double CelciusVersKelvin(double tCelcius) {
        nbConversions++;
        return tCelcius + 273.15;    
    }
public double KelvinVersCelcius(double tKelvin) {
    nbConversions++;
        return tKelvin - 273.15;
    }

public double FarenheitVersCelcius(double tFahrenheit) {
    nbConversions++;
        return (tFahrenheit - 32) * 5/9;
    }

public double CelciusVersFarenheit(double tCelcius) {
    nbConversions++;
        return (tCelcius * 9/5) + 32;
    }

public double KelvinVersFarenheit(double tKelvin) {
    nbConversions++;
        // Conversion Kelvin vers Fahrenheit en utilisant les conversions précédentes
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

public double FarenheitVersKelvin(double tFahrenheit) {
        nbConversions++;
        // Conversion Fahrenheit vers Kelvin en utilisant les conversions précédentes
        return CelciusVersKelvin(FarenheitVersCelcius(tFahrenheit));
    }
  
@Override
public String toString () {
return "nb de conversions "+ nbConversions;
}
}
