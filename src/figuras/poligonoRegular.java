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
public class poligonoRegular implements poligono, figura {

    public int lados;
    public double longitud;
    public double area;
    public double perimetro;

    public poligonoRegular(int lados, int longitud) {
        this.lados = lados;
        this.longitud = longitud;
        this.perimetro=this.longitud*this.lados;
        this.area=(this.perimetro*(this.longitud/(2*Math.tan((2*Math.PI/this.lados)/2))))/2;
    }

    @Override
    public int getLados() {
        return lados;
    }

    @Override
    public double getArea() {
        return area;
    }
    
    @Override
    public double getLongitud() {
        return longitud;
    }

    @Override
    public double Area() {
        return area;
    }

    @Override
    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public double perimetro() {
        return perimetro;
    }

}
