/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


public class Tablero {
        private Ficha[][] tablero;

    public Tablero() {
        tablero = new Ficha[8][8];
        iniciarTablero();
    }

    private void iniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    tablero[i][j] = new Ficha("B");
                }
            }
        }
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    tablero[i][j] = new Ficha("R");
                }
            }
        }
    }

    public void mostrarTablero() {
        System.out.print("  ");
        for (char c = 'A'; c <= 'H'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
        
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == null)
                    System.out.print(". ");
                else
                    System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean moverFicha(int filaO, int colO, int filaD, int colD, String turno) {
        if (!posicionValida(filaO, colO) || !posicionValida(filaD, colD))
            return false;

        Ficha f = tablero[filaO][colO];
        if (f == null) return false;
        if (!f.getColor().equals(turno)) return false;
        if (tablero[filaD][colD] != null) return false;

        int diffFila = Math.abs(filaD - filaO);
        int diffCol = Math.abs(colD - colO);
        if (diffFila != 1 || diffCol != 1) return false;

        
        if (turno.equals("R") && filaD <= filaO) return false;
        if (turno.equals("B") && filaD >= filaO) return false;

        
        tablero[filaD][colD] = f;
        tablero[filaO][colO] = null;
        return true;
    }

    private boolean posicionValida(int f, int c) {
        return f >= 0 && f < 8 && c >= 0 && c < 8;
    }
}
