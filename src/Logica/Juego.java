/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Scanner;

public class Juego {
    private Tablero tablero;
    private String turno;

    public Juego() {
        tablero = new Tablero();
        turno = "R";
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        boolean jugando = true;

        while (jugando) {
            System.out.println("\nTurno de: " + (turno.equals("R") ? "ROJAS" : "NEGRAS"));
            tablero.mostrarTablero();

            System.out.print("Fila origen: ");
            int fO = sc.nextInt();
            System.out.print("Columna origen: ");
            int cO = sc.nextInt();
            System.out.print("Fila destino: ");
            int fD = sc.nextInt();
            System.out.print("Columna destino: ");
            int cD = sc.nextInt();

            boolean mov = tablero.moverFicha(fO, cO, fD, cD, turno);

            if (mov) {
                System.out.println("Movimiento realizado :) ");
                turno = turno.equals("R") ? "B" : "R";
            } else {
                System.out.println("Movimiento invalido :( ");
            }
        }
    }

    public static void main(String[] args) {
        new Juego().iniciar();
    }
}
