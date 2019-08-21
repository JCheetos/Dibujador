/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dibujador.Dibujar;
import dibujador.ventana;
import figuras.circulo;
import figuras.figura;
import figuras.poligono;
import figuras.poligonoRegular;
import java.util.Scanner;

/**
 *
 * @author Cheetos Laptop
 */
public class principal {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        figura a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte 1 para dibujar un circulo de radio r,\nInserte cualquier otro valor para un poligono regular");
        int eleccion = sc.nextInt();
        switch(eleccion){
            case 1:
                System.out.println("Inserte el radio del circulo:");
                double radio = sc.nextDouble();
                a = new circulo(radio);
                break;
            default:
                System.out.println("Inserte los lados del poligono:");
                int lados = sc.nextInt();
                System.out.println("Inserte la longitud de uno de dichos lados:");
                int longitud = sc.nextInt();
                a = new poligonoRegular(lados,longitud);
                break;
        }
        ventana ventana = new ventana(a);
        System.out.println("La area es:"+a.Area()+", y el perimetro es:"+a.perimetro());
    }
}
