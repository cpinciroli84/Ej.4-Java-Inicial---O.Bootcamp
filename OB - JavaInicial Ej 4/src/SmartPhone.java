public class SmartPhone extends SmartDevice{
    public Double tamanioPantalla;
    public SmartPhone(){

    }
    public SmartPhone(String fabricante, String modelo, int capacidad, boolean activo, double tamanioPantalla, int aplicaciones) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.activo = activo;
        this.aplicaciones = aplicaciones;
        this.tamanioPantalla = tamanioPantalla;
    }


}
