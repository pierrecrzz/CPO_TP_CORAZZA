/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_corazza;

/**
 *
 * @author coraz
 */
public class TP2_Bieres_CORAZZA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.Nom = "Cuvée des trolls" ;
        uneBiere.degreAlcool = 7.0 ;
        String brasserie= "Dubuisson" ;
        boolean ouverte= false ;
        uneBiere.lireEtiquette() ;
        System.out.println(uneBiere) ; 
        
        
        BouteilleBiere biere1 = new BouteilleBiere ("Bière de bonhomme", 75.2, "BaobabDuSud") ;
        System.out.println(biere1) ; 
        BouteilleBiere biere2 = new BouteilleBiere ("Bière de Goblin", 74.4, "Tranchéecoupante") ;
        System.out.println(biere2) ; 
}

}