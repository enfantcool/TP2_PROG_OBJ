/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.c37.tp2.vue;

import ca.qc.bdeb.c37.tp2.modele.Fichiers;

/**
 *
 * @author enfantcool
 */
public class Vaisseau extends Image {
    public Vaisseau(Fichiers fichier) {
       super(fichier);
       this.hauteur=image.getHeight();
       this.largeur=image.getWidth();
       setSize(largeur,hauteur);
        System.out.println("Hauteur: "+hauteur+" Largeur: "+largeur);
       
    }

    

}
