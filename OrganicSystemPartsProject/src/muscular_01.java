/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Player
 */
public class muscular_01 extends Organismos{
 
    
    private String funciones;
    private String ubicacion;
    private String volumen;

    public String getFunciones() {
        return funciones;
    }


    public String getUbicaion() {
        return ubicacion;
    }
    
    public String getVolumen(){
        return volumen;
    }
     public muscular_01(String nombres,int cantidad_partes,String informacion,String funciones, String volumen,String ubicacion){
     super(nombres,cantidad_partes,informacion);
     this.funciones=funciones;
     this.volumen=volumen;
     this.ubicacion=ubicacion;
    
    }
    
    
    
}
