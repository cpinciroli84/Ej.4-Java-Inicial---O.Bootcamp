public class Main {
    public static void main(String[] args) {

        SmartDevice Celular = new SmartPhone("Apple", "iPhone 14", 256, true,7.25, 20);

        System.out.println(Celular.fabricante+" "+Celular.modelo+" - Capacidad: "+Celular.capacidad+" - Estado Activo: "
                +Celular.activo+" - Tamaño pantalla: "+((SmartPhone)Celular).tamanioPantalla
                +" - Cantidad de aplicaciones: "+Celular.aplicaciones);


        SmartDevice Reloj = new SmartWatch("Apple", "Watch Series 8", 128, true,44, 15);

        System.out.println(Reloj.fabricante+" "+Reloj.modelo+" - Capacidad: "+Reloj.capacidad+" - Estado Activo: "
                +Reloj.activo+" - Tamaño pantalla: "+((SmartWatch)Reloj).tamanioVisor
                +" - Cantidad de aplicaciones: "+Reloj.aplicaciones);

    }
}
