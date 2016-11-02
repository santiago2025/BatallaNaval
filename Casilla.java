
package data;



public class Casilla {
    
    int posicionX;
    int posicionY;
    boolean estado;
    String simbolo;

    public Casilla(int posicionX, int posicionY, boolean estado, String simbolo) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.estado = estado;
        this.simbolo = simbolo;
    }

    
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
   
    
   
    
}
