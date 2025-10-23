/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


public class Tablero {
    public Tablero(){
        
        String[][] tamanoTab= new String [9][9];
        int ubicador= 1;
        
        for (int i = 0; i < 9; i++) {
            System.out.print(ubicador);
            ubicador++;
            for (int j = 0; j < 9; j++) {
                tamanoTab [i][j]= ". ";
            }
            System.out.println();
        }
    }  
}
