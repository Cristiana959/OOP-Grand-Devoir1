/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idlegame;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Maison extends Batiment {
     private  static int revenueParSeconde=50;
    public static double coutConstructionMaisonR = 20.0;
    public static double coutConstructionMaisonV = 20.0;
    private static final int f=2;
    private static  boolean ok1 = false;
    private static  boolean ok2 = false;
    private static int nombreDeMaisons = -1;
    private static boolean check = false;
    Roche r = new Roche();
    Verre v = new Verre();
    
   //special type of building, can be built only by using rocks and glass, kind of like a final goal in the game

    /**
     *
     * @param f
     */
    
    //function that initialises the cost in rocks and glass
   /* public void initialiserCoutConstruction(){
        coutConstructionMaison.add(0,20.0);
        coutConstructionMaison.add(1,20.0);
         
    }*/
    
    //function that increases the cost of construction in rocks and glass
    @Override
     public void augumenterCoutConstruction(double f){
         
         coutConstructionMaisonR += coutConstructionMaisonR*f;
         coutConstructionMaisonV += coutConstructionMaisonV*f;
     }
     
     //function that increases the money revenu that comes from the house as you build one or more(it's a bit difficult)
     public void augumenterRevenu(){
         revenueParSeconde += 100;
     }

    public Maison(String description, String nom) {
        super(description, nom);

    }

    //when we build a new house, the total number of houses, the construction cost and the revenu/seconde increase and the total number of rocks and glass decreases
    public Maison() {
        
        if(check == false)
        {
            nombreDeMaisons++;
            check = true;
        }
        
        
        
        else
        {
        if((Roche.nombreTotalRoches >= coutConstructionMaisonR) && (Verre.getNombreTotalVerre() >= coutConstructionMaisonV))
        {r.utiliserRessource();
        v.utiliserRessource();
        augumenterCoutConstruction(f);
        augumenterRevenu();
        nombreDeMaisons++;
        }
        else
            System.out.println("You cannot build a new house.You don't have enough rocks and glass.");
    }}

    public static int getRevenueParSeconde() {
        return revenueParSeconde;
    }
    
    
    public void setNombreDeFermes(int x){
        nombreDeMaisons = x;
    }
    

    
    //function that adds to the total number of money the revenue/second 
    @Override
    public void fournitLaRessource(){
        Money.setTotalMoney(revenueParSeconde+Money.getTotalMoney()); 
    }
    /**
     * 
     *
     * @return
     */
    @Override
    public String afficherLeNombreDeBatiments(){
        return "You have "+nombreDeMaisons+" houses.";
    }

    public static int getNombreDeMaisons() {
        return nombreDeMaisons;
    }
    public static double getCoutConstructionMaisonRoche(){
        return coutConstructionMaisonR;
    }
    public static double getCoutConstructionMaisonVerre(){
        return coutConstructionMaisonV;
    }
    
    
   
}
