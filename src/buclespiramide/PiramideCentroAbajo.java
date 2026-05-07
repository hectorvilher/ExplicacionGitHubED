/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclespiramide;

/**
 *
 * @author Usuario
 */
public class PiramideCentroAbajo {

    public static void main(String[] args) {
        // Definir variables
        int filas, columnas;
        filas = 3;
        columnas = 5;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if ((j<i)){ //|| (j>= columnas - i)) {la segunda parte del || no sería realmente necesaria
                    System.out.print(" ");
                } else if((j >= i)&&(j<columnas - i)){
                    System.out.print("X");
                }
            }
            System.out.println("");
        }
    }

}
