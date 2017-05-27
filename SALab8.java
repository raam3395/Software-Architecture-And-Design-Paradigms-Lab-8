/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab8;

/**
 *
 * @author Raam
 */
public class SALab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        
        CoffeeWithHook a = new CoffeeWithHook();
        a.prepareRecipe();
    }
    
}
