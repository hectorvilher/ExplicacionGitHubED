/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclespiramide;

/**
 *
 * @author Usuario
 */
public class pruebas {

    public static void main(String[] args) {
        // Definir variables
        int filas, columnas;
        filas = 3;
        columnas = 5;
//      PARA PIRAMIDE CENTRAL ARRIBA
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//                if ((j >= (columnas / 2) - i) && (j <= (columnas / 2) + i)) {
//                    System.out.print("X");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }

//      PARA PIRAMIDE CENTRAL ABAJO
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if((j<i) || (j>=columnas -i)){
                    System.out.print(" ");
                }else if((j>=i) && (j<=columnas- i)){
                    System.out.print("X");
                }
            }
            System.out.println("");
        }
    }

}
