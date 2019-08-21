/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujador;

import figuras.figura;
import javax.swing.JFrame;

/**
 *
 * @author Cheetos Laptop
 */
public class ventana extends JFrame {
    public ventana(figura eleccionFigura){
        this.setSize(500, 500);
        initComponents(eleccionFigura);
        this.setVisible(true);
    }
    private void initComponents(figura eleccionFigura){
        Dibujar dibujador = new Dibujar(eleccionFigura);
        this.setContentPane(dibujador);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
