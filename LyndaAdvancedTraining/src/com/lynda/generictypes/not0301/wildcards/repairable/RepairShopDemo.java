/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301.wildcards.repairable;

import java.util.Arrays;

/**
 *
 * @author root
 */
public class RepairShopDemo {
    
    public static void main(String[] args) {
        
        
        RepairShop.fixAll(Arrays.asList(new Toaster() , new Furniture() , new Blender()));
    }
}
