
package Paquete1;


public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto(5000,1500);
        Buques buque = new Buques(500);
        Buses bus = new Buses(40,800);
        Camiones camion = new Camiones(40,500);
        Camionetas camioneta = new Camionetas(800,5000);
        Cruceros crucero = new Cruceros(800);
        Fragatas fragata = new Fragatas(500);
        Lanchas lancha = new Lanchas(8);
        Motos moto = new Motos(2000,1000);
        Pesqueros pesquero = new Pesqueros(5000);
        Portaaviones poraviones = new Portaaviones(50);
        Submarinosnucleares submarino = new Submarinosnucleares(10);
        Trailers trailer = new Trailers(1,500);
        Yates yate = new Yates(25);
        
        System.out.println("-------- Transportes ---------------");
        System.out.println("**** Terrestres ******");
        System.out.println("++++ Vehiculos livianos ++++");
        auto.Transportar();
        camioneta.Transportar();
        moto.Transportar();
        System.out.println("++++ Vehiculos Pesados ++++");
        bus.Transportar();
        camion.Transportar();
        trailer.Transportar();
        System.out.println("******** Maritimos *********");
        System.out.println("++++++ Barcos ++++++");
        System.out.println("------ Barcos Comerciales ------");
        crucero.Transportar();
        buque.Transportar();
        pesquero.Transportar();
        System.out.println("------ Barcos Privados ------");
        yate.Transportar();
        lancha.Transportar();
        System.out.println("------ Barcos militares ------");
        poraviones.Transportar();
        fragata.Transportar();
        System.out.println("+++++ Submarinos  ++++++");
        System.out.println("------ Militares ------");
        submarino.Transportar();
          
    }
}
