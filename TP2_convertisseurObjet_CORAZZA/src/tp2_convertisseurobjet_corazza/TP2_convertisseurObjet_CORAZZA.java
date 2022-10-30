/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_corazza;

/**
 *
 * @author coraz
 */
public class TP2_convertisseurObjet_CORAZZA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args)  {
        
        Convertisseur temperature=new Convertisseur() ;
        
            temperature .CelciusVersKelvin(265 )  ;
        
            temperature . FarenheitVersCelcius(125 ) ;
        
            temperature .KelvinVersFarenheit(59 )  ;
        
        
        
        Convertisseur celcius = new Convertisseur() ;
        
            celcius .CelciusVersKelvin (36 ) ;
        
            celcius .CelciusVersFarenheit (298 ) ;   
        
        
            
System.out.println(celcius)  ;
        
System.out.println(temperature)  ;
        
    }//Fin du main 
}