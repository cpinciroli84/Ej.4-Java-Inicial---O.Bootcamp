public class SmartWatch extends SmartDevice{
     public Double tamanioVisor;

    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, int capacidad, boolean activo, double tamanioVisor, int aplicaciones) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.activo = activo;
        this.aplicaciones = aplicaciones;
        this.tamanioVisor = tamanioVisor;
    }
}
