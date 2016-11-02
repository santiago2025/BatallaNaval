
package data;

import java.util.Random;

import UI.Tablero;


public class JugadorPC {
    private String Nombre;
    Tablero tablero;
    Submarino m;  
    Barcoc b;

    public JugadorPC(String Nombre) {
        this.Nombre = Nombre;
        this.tablero = new Tablero();
        m = new Submarino(); 
        b = new Barcoc();
        ubicarBarco(m);
        ubicarBarco(b);
       
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Tablero getTablero() {
        return tablero;
    }
    
    public void ubicarBarco(Submarino m){
        Random  rnd = new Random();
        int x = rnd.nextInt()*7;
        int y = rnd.nextInt()*7;
        tablero.PintarBarco(m, x, y);
    }
    
    public void ubicarBarco(Barcoc m){
    	int x = -1;
        int y = -1;
        Random  rnd = new Random();
        while(x <= 8 && x >=0 && y <= 8 && y >=0 ){
        x = rnd.nextInt()*7;
        y = rnd.nextInt()*7;};
        tablero.PintarBarco1(m, x, y);
    }
    

 
}
