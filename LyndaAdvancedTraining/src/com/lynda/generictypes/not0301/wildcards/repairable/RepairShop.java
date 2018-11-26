/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda.generictypes.not0301.wildcards.repairable;

import java.util.List;

/**
 *
 * @author root
 */
public class RepairShop {
 
    public static <T extends Repairable> void fixAll(List<T> items){
    
        items.forEach(T::fix);
    }
}
