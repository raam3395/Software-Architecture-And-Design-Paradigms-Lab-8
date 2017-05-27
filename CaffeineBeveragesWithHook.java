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
public abstract class CaffeineBeveragesWithHook {
    
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
        addCondiments();
        }
    }
    
    abstract void brew();
    abstract void addCondiments();
    
    public void boilWater(){
        System.out.println("Boiling water");
    }
    
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    boolean customerWantsCondiments(){
        return true;
    }
}
