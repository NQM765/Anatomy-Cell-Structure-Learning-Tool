
public class Organismos {

    private String nombres;
    private int cantidad_partes;
    private String informacion;

    public String getNombres() {
        return nombres;
    }

    public int getCantidad_partes() {
        return cantidad_partes;
    }

    public String getInformacion() {
        return informacion;
    }

    Organismos(String nombres, int cantidad_partes, String informacion) {
        this.nombres = nombres;
        this.cantidad_partes = cantidad_partes;
        this.informacion = informacion;
    }

}
