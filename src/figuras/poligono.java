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
public class poligono extends figura{
    public int lados;
    public double longitud;
    
    @Override
    public int getLados(){
        return lados;
    }
    
    public double getLongitud(){
        return longitud;
    }
}
