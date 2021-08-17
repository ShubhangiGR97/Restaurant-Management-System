/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SupperClass_parent {
    public double filet_o_fish;
    public double chickenBurger;
    public double chickenLegend;
    public double chickenBurgerMeal;
    public double baconAndCheeseBurger;
    public double text;
    
    public double vanilaShake;
    public double vanilaCone;
    public double clasicVanila;
    public double vanilaMilkshake;
    public double chocolateMilkShake;
    
    public double meals;
    public double drinks;
    public double total ;
    
    public double getMeal(){
        meals = filet_o_fish + chickenBurger + chickenLegend + chickenBurgerMeal
                + baconAndCheeseBurger;
        return meals;
    }
    public double getDrinks(){
        drinks = vanilaShake + vanilaCone + clasicVanila + vanilaMilkshake +
                chocolateMilkShake;
        return drinks;
    }
    
    public double getAmount(double meals, double drinks){
        
        total = meals + drinks;
        return total;
    }
    
    private  JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit",
                "Resturent Management System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    public double pFilet_o_fish = 150.00;
    public double pChickenBurger = 200.00;
    public double pChickenLegend = 100.00;
    public double PChickenBurgerMeal = 250.00;
    public double pBaconAndCheeseBurger = 300.00;
    
    public double pVanilaShake = 180.00;
    public double pVanilaCone = 200.00;
    public double pClasicVanila = 150.00;
    public double pVanilaMilkshake = 200.00;
    public double pChocolateMilkShake = 250.00;
    
    public double mcTax = 0.9;
    
    public double cFindTax(double cAmount){
        double findTax = cAmount -(cAmount*mcTax);
        return findTax;
    }
    
    
}
