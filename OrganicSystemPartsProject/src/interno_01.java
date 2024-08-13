/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Player
 */
public class interno_01 extends Organismos {
    
    private String funciones;
    private String tamaño;
    private String ubicacion;

    public String getFunciones() {
        return funciones;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getUbicaion() {
        return ubicacion;
    }
     public interno_01(String nombres,int cantidad_partes,String informacion,String funciones,String tamaño,String ubicacion){
     super(nombres,cantidad_partes,informacion);
     this.funciones=funciones;
     this.tamaño=tamaño;
     this.ubicacion=ubicacion;
    
    }
    
    
    


    
}
