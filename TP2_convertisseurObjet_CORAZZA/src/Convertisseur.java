/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coraz
 */
public class Convertisseur {
    int nbConversions;
    

public Convertisseur()  { 
    nbConversions = 0 ;               
}

@Override
public String toString () {

return "nombre de conversion est "+ nbConversions;
}


public double CelciusVersKelvin (double tempCelcius) {
    
    double res = (double) (tempCelcius + 273.15) ;
    nbConversions = nbConversions + 1;
    return res  ;
}


public double KelvinVersCelcius (double tempKelvin)  {

    double res=( double ) (tempKelvin - 273.15 )  ;
    nbConversions = nbConversions + 1 ;
    return res ;
}


public double FarenheitVersCelcius (double tempFahren)  {

    double res=( double ) (tempFahren - 32)/1.8  ;
    nbConversions = nbConversions + 1;
    return res  ;
}


public double CelciusVersFarenheit (double tempCelcius)  {

    double res=(double) (tempCelcius + 32 )*1.8 ;
    nbConversions = nbConversions + 1 ;
    return res  ;
}


public double KelvinVersFarenheit (double tempKelvin)  {
    double tempCelsius=KelvinVersCelcius( tempKelvin );
    double res = CelciusVersFarenheit( tempCelsius );
    nbConversions = nbConversions + 1;
    return res  ;
}

public double FarenheitVersKelvin (double tempFahren)   {
    double tempCelcius = FarenheitVersCelcius (tempFahren) ;
    double res=CelciusVersKelvin(tempCelcius) ;
    nbConversions = nbConversions + 1  ;
    return res  ;
}    
}
