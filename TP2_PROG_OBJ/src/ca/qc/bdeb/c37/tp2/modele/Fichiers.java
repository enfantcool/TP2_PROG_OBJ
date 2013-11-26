/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.c37.tp2.modele;

/**
 *
 * @author enfantcool
 */
public enum Fichiers {
    VAISSEAU("Images/Gundam_Standard.png"),
    BACKGROUND("Images/background.png");
    
    private String chemin = "";
    Fichiers(String chemin){
        this.chemin=chemin;
    }

    @Override
    public String toString() {
        return chemin;
    }
    
}
