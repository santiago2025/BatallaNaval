package data;

import UI.Tablero;
import java.util.Random;

public final class Jugador {

    private String Nombre;
    private Tablero tablero;
    private Tablero tablero2;
    private int numeroAciertos;

    Submarino m;
    Barcoc b;
    Lancha l;
    PortaAviones pa;
    SubmarinoB sb;

    public Jugador(String Nombre) {

        this.Nombre = Nombre;
        this.tablero = new Tablero();
        sb = new SubmarinoB();
        m = new Submarino();
        b = new Barcoc();
        pa = new PortaAviones();
        l = new Lancha();

        System.out.println("\n\n UBICAR SUBMARINO");
        m.dibujarBarco();
        ubicarBarco(this.tablero, m);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR BARCO");
        b.dibujarBarco();
        ubicarBarco(this.tablero, b);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR PORTA AVIONES");
        pa.dibujarBarco();
        ubicarBarco(this.tablero, pa);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR SUBMARINO 2");
        sb.dibujarBarco();
        ubicarBarco(this.tablero, sb);
        this.tablero.imprimirTablero();
        System.out.println("\n\n UBICAR LANCHA");
        l.dibujarBarco();
        ubicarBarco(this.tablero, l);
        this.tablero.imprimirTablero();

    }
    
    public void disparar(JugadorPC j){
            j.getTablero2().imprimirTablero();
            boolean disparo = false;
            int x = tablero.pedirCoordenadaY(9);
            int y = tablero.pedirCoordenadaX(9);
            while(!disparo){
            if(j.getTablero().getBoard()[x][y].isEstado()==true){
                j.getTablero2().board[x][y].setSimbolo("  O  ");
                j.getTablero().getBoard()[x][y].setEstado(false);
                disparo = true;
                
            }
            else if(j.getTablero().getBoard()[x][y].isEstado()==false && j.getTablero().getBoard()[x][y].isHayBarco()==true){
                j.getTablero2().board[x][y].setSimbolo("  #  ");
                j.getTablero().getBoard()[x][y].setHayBarco(false);
                j.setNumeroAciertos(j.getNumeroAciertos()+1);
                disparo = true;
                
           }
            
            else if(j.getTablero().getBoard()[x][y].isEstado()==false && j.getTablero().getBoard()[x][y].isHayBarco()==false){
                System.out.println("no puede disparar dos veces en la misma casilla");
                x = tablero.pedirCoordenadaY(9);
                y = tablero.pedirCoordenadaX(9);
           }
            }
            j.getTablero2().imprimirTablero();
            
        }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }

    public Tablero getTablero2() {
        return tablero2;
    }

    public void setTablero2(Tablero tablero2) {
        this.tablero2 = tablero2;
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

    public void ubicarBarco(Tablero tablero, Submarino m) {
        Random rnd = new Random();
        int x;
        int y;
        boolean ubicacion = false;
        int direccion;

        direccion = tablero.pedirOrientacion();
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(6);
            y = tablero.pedirCoordenadaY(9);

            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 2][y].isEstado() == true && tablero.board[x + 3][y].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(m.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(m.partes[2]);
                    tablero.board[x + 3][y].setEstado(false);
                    tablero.board[x + 3][y].setHayBarco(true);
                    tablero.board[x + 3][y].setSimbolo(m.partes[3]);
                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(6);
                    y = tablero.pedirCoordenadaY(9);
                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9);
            y = tablero.pedirCoordenadaY(6);

            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true && tablero.board[x][y + 3].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(m.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(m.partes[2]);
                    tablero.board[x][y + 3].setEstado(false);
                    tablero.board[x][y + 3].setHayBarco(true);
                    tablero.board[x][y + 3].setSimbolo(m.partes[3]);
                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(9);
                    y = tablero.pedirCoordenadaY(6);
                }
            }
        }
    }

    public void ubicarBarco(Tablero tablero, Barcoc m) {
        int x;
        int y;
        Random rnd = new Random();
        boolean ubicacion = false;
        int direccion;

        direccion = tablero.pedirOrientacion();
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(7);
            y = tablero.pedirCoordenadaY(9);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 1][y].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(m.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(m.partes[2]);

                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(7);
                    y = tablero.pedirCoordenadaY(9);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9);
            y = tablero.pedirCoordenadaY(7);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(m.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(m.partes[2]);

                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(9);
                    y = tablero.pedirCoordenadaY(7);

                }
            }
        }
    }

    public void ubicarBarco(Tablero tablero, Lancha l) {
        int x;
        int y;
        int direccion;
        Random rnd = new Random();
        boolean ubicacion = false;

        direccion = tablero.pedirOrientacion();
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(8);
            y = tablero.pedirCoordenadaY(9);
            while (!ubicacion) {

                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true) {

                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(l.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(l.partes[1]);
                    ubicacion = true;

                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(8);
                    y = tablero.pedirCoordenadaY(9);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9);
            y = tablero.pedirCoordenadaY(8);
            while (!ubicacion) {

                if (tablero.board[x][y + 1].isEstado() == true && tablero.board[x][y].isEstado() == true) {

                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(l.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(l.partes[1]);
                    ubicacion = true;

                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(9);
                    y = tablero.pedirCoordenadaY(8);

                }
            }
        }
    }

    public void ubicarBarco(Tablero tablero, PortaAviones pa) {
        Random rnd = new Random();
        int x;
        int y;
        int direccion;
        boolean ubicacion = false;

        direccion = tablero.pedirOrientacion();
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(5);
            y = tablero.pedirCoordenadaY(9);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 2][y].isEstado() == true && tablero.board[x + 3][y].isEstado() == true
                        && tablero.board[x + 4][y].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(pa.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(pa.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(pa.partes[2]);
                    tablero.board[x + 3][y].setEstado(false);
                    tablero.board[x + 3][y].setHayBarco(true);
                    tablero.board[x + 3][y].setSimbolo(pa.partes[3]);
                    tablero.board[x + 4][y].setEstado(false);
                    tablero.board[x + 4][y].setHayBarco(true);
                    tablero.board[x + 4][y].setSimbolo(pa.partes[4]);
                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(5);
                    y = tablero.pedirCoordenadaY(9);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9);
            y = tablero.pedirCoordenadaY(5);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true && tablero.board[x][y + 3].isEstado() == true
                        && tablero.board[x][y + 4].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(pa.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(pa.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(pa.partes[2]);
                    tablero.board[x][y + 3].setEstado(false);
                    tablero.board[x][y + 3].setHayBarco(true);
                    tablero.board[x][y + 3].setSimbolo(pa.partes[3]);
                    tablero.board[x][y + 4].setEstado(false);
                    tablero.board[x][y + 4].setHayBarco(true);
                    tablero.board[x][y + 4].setSimbolo(pa.partes[4]);
                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(9);
                    y = tablero.pedirCoordenadaY(5);

                }
            }
        }
    }

    public void ubicarBarco(Tablero tablero, SubmarinoB m2) {
        Random rnd = new Random();
        int x;
        int y;
        int direccion;
        boolean ubicacion = false;

        direccion = tablero.pedirOrientacion();
        if (direccion == 0) {
            x = tablero.pedirCoordenadaX(7);
            y = tablero.pedirCoordenadaY(9);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x + 1][y].isEstado() == true
                        && tablero.board[x + 2][y].isEstado() == true) {
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m2.partes[0]);
                    tablero.board[x + 1][y].setEstado(false);
                    tablero.board[x + 1][y].setHayBarco(true);
                    tablero.board[x + 1][y].setSimbolo(m2.partes[1]);
                    tablero.board[x + 2][y].setEstado(false);
                    tablero.board[x + 2][y].setHayBarco(true);
                    tablero.board[x + 2][y].setSimbolo(m2.partes[2]);
                    ubicacion = true;

                } else {
                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(7);
                    y = tablero.pedirCoordenadaY(9);

                }
            }
        } else if (direccion == 1) {
            x = tablero.pedirCoordenadaX(9);
            y = tablero.pedirCoordenadaY(7);
            while (!ubicacion) {
                if (tablero.board[x][y].isEstado() == true && tablero.board[x][y + 1].isEstado() == true
                        && tablero.board[x][y + 2].isEstado() == true) {
                    ubicacion = true;
                    tablero.board[x][y].setEstado(false);
                    tablero.board[x][y].setHayBarco(true);
                    tablero.board[x][y].setSimbolo(m2.partes[0]);
                    tablero.board[x][y + 1].setEstado(false);
                    tablero.board[x][y + 1].setHayBarco(true);
                    tablero.board[x][y + 1].setSimbolo(m2.partes[1]);
                    tablero.board[x][y + 2].setEstado(false);
                    tablero.board[x][y + 2].setHayBarco(true);
                    tablero.board[x][y + 2].setSimbolo(m2.partes[2]);

                } else {

                    ubicacion = false;
                    System.out.println("esocoja posiciones disponibles");
                    x = tablero.pedirCoordenadaX(9);
                    y = tablero.pedirCoordenadaY(7);
                }
            }
        }

    }

}
