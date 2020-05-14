/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.designpatterns.structural.adapter;

/**
 *
 * @author yurii
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The captain can only operate rowing boats but with adapter he is able to
        // use fishing boats as well
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
    
}
