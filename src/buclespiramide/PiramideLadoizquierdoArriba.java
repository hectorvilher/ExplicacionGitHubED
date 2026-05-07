/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package buclespiramide;

/**
 *
 * @author Usuario
 */
public class PiramideLadoizquierdoArriba {

  
    public static void main(String[] args) {
        // Definir variables
        int filas = 5;//en esta piramide el numero de filas es igual al de columnas
        //int columnas = 5;
        for(int i = 0; i< filas; i++){
            for(int j = 0; j < filas ; j++){
                if(j<=i){
                    System.out.print("X");
                }
                
            }
            System.out.println("");
        }
    }

}
