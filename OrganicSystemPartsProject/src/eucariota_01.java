/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Player
 */
public class eucariota_01 extends Organismos {

 private String funciones;
 private int tamaño;
 private String seres_vivos;
    
   

    public String getFunciones() {
        return funciones;
    }


   
       public int getTamaño() {
        return tamaño;
    }
          public String getSeres_vivos() {
        return seres_vivos;
    }
    
  
     public eucariota_01(String nombres,int cantidad_partes,String informacion,String funciones,int tamaño,String seres_vivos){
     super(nombres,cantidad_partes,informacion);
     this.funciones=funciones;
     this.seres_vivos=seres_vivos;
     this.tamaño=tamaño;

    
    }    
}
