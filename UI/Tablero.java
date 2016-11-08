
package UI;

import java.util.Scanner;


import data.Casilla;
import data.Jugador;
import data.JugadorPC;
import java.util.InputMismatchException;


public class Tablero {

	public Casilla[][] board = new Casilla[10][10];
	Scanner input;

	public Tablero() {

		{
			for (int r = 0; r < board.length; r++) {
                            
				for (int c = 0; c < board[0].length; c++) {

					board[r][c] = new Casilla(r, c, true, "  .  ", false);
				}
			}
		}
	}

	public void imprimirTablero() {

            System.out.print(" \t");
            for(int i = 0; i<10; i++){System.out.print("  "+i+"  ");}
            System.out.println();
		for (int r = 0; r < board.length; r++) {
                    
                    System.out.print(r+"\t");
			for (int c = 0; c < board[0].length; c++) {
				System.out.print(board[r][c].getSimbolo());
			}
			System.out.println();
		}

	}

	public int pedirCoordenadaX(int limite) {
            
            System.out.println("ingrese la posicion en Y entre 0 y "+ limite);
		int x = -1;
                boolean valorCorrecto = false;
                do{
                try{
		input = new Scanner(System.in);
		x = input.nextInt();
                if(x<0 || x>limite){System.out.println("solo se admiten valores entre 0 y "+ limite);
                }
                else{valorCorrecto = true;}}
                catch(InputMismatchException i){
                    input = new Scanner(System.in);
                    System.out.println("ingrese valores numericos unicamente");
                }
                }while(!valorCorrecto);
		return x;
	}
        
        public int pedirCoordenadaY(int limite) {
            System.out.println("ingrese la posicion en X entre 0 y "+ limite);
		int x = -1;
                boolean valorCorrecto = false;
                
                do{
                try{
		input = new Scanner(System.in);
		x = input.nextInt();
                if(x<0 || x>limite){System.out.println("solo se admiten valores entre 0 y 9");
                }
                else{valorCorrecto = true;}}
                catch(InputMismatchException i){
                    input = new Scanner(System.in);
                    System.out.println("ingrese valores numericos unicamente");
                }
                }while(!valorCorrecto);
		return x;
	}
        
        public int pedirOrientacion(){
            int x = -1;
                boolean valorCorrecto = false;
                System.out.println("1. vertical \t\t 2.horizontal");
                do{
                try{
		input = new Scanner(System.in);
		x = input.nextInt();
                if(x>=1 && x<=2){valorCorrecto = true;}
                else{System.out.println("solo se admiten valores entre 1 y 2");
                }}
                catch(InputMismatchException i){
                    input = new Scanner(System.in);
                    System.out.println("ingrese valores numericos unicamente");
                }
                }while(!valorCorrecto);
		return x-1;
        }
        
        

	



	/**
	 * @return the board
	 */
	public Casilla[][] getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(Casilla[][] board) {
		this.board = board;
	}

    public void disparar(JugadorPC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}