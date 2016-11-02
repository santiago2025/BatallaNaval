
package UI;

import java.util.Scanner;

import data.Barcoc;
import data.Casilla;
import data.Submarino;


public class Tablero {
    
    static Casilla[][] board = new Casilla[8][8];

    public Tablero(){
       
      {
         for(int r = 0; r < board.length; r++)
         {
            for(int c = 0; c < board[0].length; c++)
            {
               
               board[r][c] = new Casilla(r,c,true,"  .  ");
            }
         }
      }
}

    
    
    public void imprimirTablero() {
        
        for (Casilla[] board1 : board) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(board1[c].getSimbolo());
            }
            System.out.println();
        }
      
     
}

    
    public int pedirCoordenadas(){
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
      
          if (x>8)
          {
              System.out.println("el mov tiene que estár en 1-8");
          }
  
         
          return x;
}
    
    public void PintarBarco(Submarino m,int x, int y){
        if(board[x][y].isEstado()==true){
        board[x][y].setEstado(false);
           board[x][y].setSimbolo(m.getFigura1());
        board[x+1][y].setEstado(false);
        board[x+1][y].setSimbolo(m.getFigura2());
        board[x+2][y].setEstado(false);
        board[x+2][y].setSimbolo(m.getFigura3());
        board[x+3][y].setEstado(false);
        board[x+3][y].setSimbolo(m.getFigura4());
        }
    }
    
    public static void PintarBarco1(Barcoc m,int x, int y){
        if(board[x][y].isEstado()==true){
        board[x][y].setEstado(false);
        board[x][y].setSimbolo(m.getFigura1());
        board[x+1][y].setEstado(false);
        board[x+1][y].setSimbolo(m.getFigura2());
        board[x+2][y].setEstado(false);
        board[x+2][y].setSimbolo(m.getFigura3());
        
        }
    }
   
}