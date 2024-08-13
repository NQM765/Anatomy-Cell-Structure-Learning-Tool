/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Player
 */
public class superficial_1 extends Organismos{
    
    private double medida;
    private String color;

    public double getMedida() {
        return medida;
    }

    public String getColor() {
        return color;
    }
    
    public superficial_1(String nombres,int cantidad_partes,String informacion,double medida,String color){
     super(nombres,cantidad_partes,informacion);
     this.medida=medida;
     this.color=color;
        
    }
    
    
}
