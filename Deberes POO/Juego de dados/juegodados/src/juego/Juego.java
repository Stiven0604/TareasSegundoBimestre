
package juego;

import java.util.Scanner;

/**
 *
 * @author Edison Córdoba
 */
public class Juego {
    Scanner entrada=new Scanner(System.in);
    //atributos
    private Dado[]dados=new Dado[5];
    private Jugador[] jugadores;//=new Jugador[?];
    
    //metodos
    void menu(){
        //System.out.println("menu");
        
        inicializaciones();
        registrarJugadores();
        jugar();
        mostrar();
    }
    
    void inicializaciones(){
        //System.out.println("inicializaciones");
        //inicializacion de los dados
        
        for(int i=0;i<dados.length;i++){
            dados[i]=new Dado(1,true);
        }
        //inicializacion de los jugadores
        
        System.out.println("cuantos jugadores quiere");
        int num=entrada.nextInt();
        //inicializar el arreglo jugadores
        jugadores=new Jugador[num];
    }
    
    void registrarJugadores(){
        //System.out.println("registrarjugadores");
        
        for(int i=0;i<jugadores.length;i++){
            System.out.println("ingrese el nombre del jugador");
            String nom=entrada.nextLine();
            jugadores[i]=new Jugador(nom,0);
            System.out.println(jugadores[i]);
        }   
    }
    
    void jugar(){
        //System.out.print("jugar");
    }  
    
    void mostrar(){
        System.out.println();
    }
}
