
package Negocios;

import UI.Tablero;
import data.Barcoc;
import data.Submarino;

public class Juego {
    Tablero t = new Tablero();
    
    public static void main(String[] args){
    
        int x = 0;
        int y = 0;
        Submarino s = new Submarino();
        Barcoc b = new Barcoc();
        Tablero t = new Tablero();
        t.imprimirTablero();
        boolean jugar = true;
        
        	
        System.out.println("porfavor ingrese coordenana y del submarino");
        x=t.pedirCoordenadas();
        System.out.println("porfavor ingrese coordenana x del subbmarino");
        y=t.pedirCoordenadas();
        t.PintarBarco(s, x, y);
        t.imprimirTablero();
        
        System.out.println("porfavor ingrese coordenana y del barco");
        x=t.pedirCoordenadas();
        System.out.println("porfavor ingrese coordenana x del barco");
        y=t.pedirCoordenadas();
        t.PintarBarco1(b, x, y);
        t.imprimirTablero();
         
    }
    
}
