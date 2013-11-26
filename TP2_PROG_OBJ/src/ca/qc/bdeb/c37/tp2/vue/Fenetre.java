/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.qc.bdeb.c37.tp2.vue;

import ca.qc.bdeb.c37.tp2.modele.Fichiers;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author enfantcool
 */
public class Fenetre extends JFrame{
    protected Vaisseau vaisseau;
    
    public Fenetre(){
         
        vaisseau=new Vaisseau(Fichiers.VAISSEAU);
        
        setContentPane(new Image(Fichiers.BACKGROUND));
        add(vaisseau);
        vaisseau.setLocation(200,400);
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setVisible(true);
}
}
