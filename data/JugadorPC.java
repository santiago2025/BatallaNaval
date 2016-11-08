package data;

import java.util.Random;

import UI.Tablero;

public final class JugadorPC {

    private int numeroAciertos;

   
    private String Nombre;
    private Tablero tablero;
    private Tablero tablero2;
    Submarino m;
    Barcoc b;
    Lancha l;
    PortaAviones pa;
    SubmarinoB sb;

    public JugadorPC(String Nombre) {
        this.Nombre = Nombre;
        this.tablero = new Tablero();
        tablero2 = new Tablero();
        sb = new SubmarinoB();
        m = new Submarino();
        b = new Barcoc();
        pa = new PortaAviones();
        l = new Lancha();

        ubicarBarco(this.tablero, m);
        ubicarBarco(this.tablero, b);
        ubicarBarco(this.tablero, pa);
        ubicarBarco(this.tablero, sb);
        ubicarBarco(this.tablero, l);
        
        tablero.imprimirTablero();

        
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

        direccion = rnd.nextInt(2);
        if(direccion == 0){
        x = rnd.nextInt(7);
        y = rnd.nextInt(10);
        
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
                x = rnd.nextInt(7);
                y = rnd.nextInt(10);
            }
        }}
        else if(direccion == 1){
        x = rnd.nextInt(10);
        y = rnd.nextInt(7);
        
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
                x = rnd.nextInt(10);
                y = rnd.nextInt(7);
            }
        }}
    }

    public void ubicarBarco(Tablero tablero, Barcoc m) {
        int x;
        int y;
        Random rnd = new Random();
        boolean ubicacion = false;
        int direccion;

        direccion = rnd.nextInt(2);
        if (direccion == 0) {
            x = rnd.nextInt(8);
            y = rnd.nextInt(10);
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
                    x = rnd.nextInt(8);
                    y = rnd.nextInt(10);
                }
            }
        } else if (direccion == 1) {
            x = rnd.nextInt(8);
            y = rnd.nextInt(10);
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
                    x = rnd.nextInt(10);
                    y = rnd.nextInt(8);
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

        direccion = rnd.nextInt(2);
        if (direccion == 0) {
            x = rnd.nextInt(9);
            y = rnd.nextInt(10);
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
                    x = rnd.nextInt(9);
                    y = rnd.nextInt(10);
                }
            }
        } else if (direccion == 1) {
            x = rnd.nextInt(10);
            y = rnd.nextInt(9);
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
                    x = rnd.nextInt(10);
                    y = rnd.nextInt(9);
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

        direccion = rnd.nextInt(2);
        if (direccion == 0) {
            x = rnd.nextInt(6);
            y = rnd.nextInt(10);
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
                    x = rnd.nextInt(6);
                    y = rnd.nextInt(10);
                }
            }
        } else if (direccion == 1) {
            x = rnd.nextInt(10);
            y = rnd.nextInt(6);
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
                    x = rnd.nextInt(10);
                    y = rnd.nextInt(6);
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

        direccion = rnd.nextInt(2);
        if (direccion == 0) {
            x = rnd.nextInt(8);
            y = rnd.nextInt(10);
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
                    x = rnd.nextInt(8);
                    y = rnd.nextInt(10);
                }
            }
        } else if (direccion == 1) {
            x = rnd.nextInt(10);
            y = rnd.nextInt(8);
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
                    x = rnd.nextInt(10);
                    y = rnd.nextInt(8);
                    ubicacion = false;
                }
            }
        }

    }

}
