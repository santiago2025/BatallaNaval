package Negocios;

import UI.Tablero;
import data.Jugador;
import data.JugadorPC;

public class Juego {

    static JugadorPC pc;

    public static void main(String[] args) {
        
        boolean fin = false;
        
        Jugador j1 = new Jugador("david");
        JugadorPC pc = new JugadorPC("PC");
        
        while(!fin){
            j1.disparar(pc);
        }
        

    }

}
