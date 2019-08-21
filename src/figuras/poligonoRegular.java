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
public class poligonoRegular extends poligono {
    
    
    public poligonoRegular(int lados, int longitud){
        this.lados = lados;
        this.longitud = longitud;
        this.perimetro=this.longitud*this.lados;
        this.area=(this.perimetro*(this.longitud/(2*Math.tan(180/this.lados))))/2;
    }

}
