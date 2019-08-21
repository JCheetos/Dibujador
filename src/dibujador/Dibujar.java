/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujador;

import figuras.figura;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Cheetos Laptop
 */
public class Dibujar extends JPanel {

    public figura figuraSeleccionada;

    public Dibujar(figura eleccionFigura) {
        this.figuraSeleccionada = eleccionFigura;
    }

    @Override
    protected void paintComponent(Graphics g) {
        int vertice;
        int xCenter;
        int yCenter;
        int radius;
        Polygon polygon;
        switch (this.figuraSeleccionada.getClass().getName()) {
            case "figuras.circulo":
                super.paintComponent(g);

                vertice = 360;
                xCenter = getWidth() / 2;
                yCenter = getHeight() / 2;
                radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

                polygon = new Polygon();

                g.setColor(Color.RED);
                polygon.addPoint(xCenter + radius, yCenter);
                //aqui vamos agregar 2 puntos mas por lo tanto agregamos otros 2 metodos matematicos
                for (int i = 0; i < vertice; i++) {
                    polygon.addPoint((int) (xCenter + radius * Math.cos(i * 2 * Math.PI / vertice)), (int) (yCenter - radius * Math.sin(i * 2 * Math.PI / vertice)));
                }

                g.drawPolygon(polygon);
                break;
            case "figuras.poligonoRegular":
                super.paintComponent(g);

                vertice = this.figuraSeleccionada.getLados();
                xCenter = getWidth() / 2;
                yCenter = getHeight() / 2;
                radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

                polygon = new Polygon();

                g.setColor(Color.BLUE);
                polygon.addPoint(xCenter + radius, yCenter);
                //aqui vamos agregar 2 puntos mas por lo tanto agregamos otros 2 metodos matematicos
                for (int i = 0; i < vertice; i++) {
                    polygon.addPoint((int) (xCenter + radius * Math.cos(i * 2 * Math.PI / vertice)), (int) (yCenter - radius * Math.sin(i * 2 * Math.PI / vertice)));
                }

                g.drawPolygon(polygon);
                break;
        }

    }
}
