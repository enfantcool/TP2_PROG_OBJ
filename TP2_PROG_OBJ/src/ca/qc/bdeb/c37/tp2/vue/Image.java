/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.c37.tp2.vue;

import ca.qc.bdeb.c37.tp2.modele.Fichiers;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author enfantcool
 */
public class Image extends JLabel{
    protected BufferedImage image;
    protected int hauteur,largeur;
    protected Fichiers fichier;
    
    public Image(Fichiers fichier){
        this.fichier=fichier;
         image = initialiserImage(fichier.toString());
        setIcon(new ImageIcon(image));
        
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    
    private BufferedImage initialiserImage(String fichier){
        BufferedImage img = null;
        try {
            img = ImageIO.read(this.getClass().getResource(fichier));
            return img;
        } catch (IOException e) {
            return null;
        }
    }
}

