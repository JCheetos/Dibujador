/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Cheetos Laptop
 */
public class circulo implements figura {
    
    public double area;
    public double perimetro;
    public double radio;
    
    public circulo(double radio){
        this.radio= radio;
        this.area= Math.PI*Math.pow(this.radio, 2);
        this.perimetro= 2*Math.PI*this.radio;
    }

    @Override
    public double Area() {
       return area;
    }

    @Override
    public double perimetro() {
        return perimetro; 
    }

    @Override
    public int getLados() {
        return 360;
    }
}
