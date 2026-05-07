/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package buclespiramide;

/**
 *
 * @author Usuario
 */
public class PiramideLadoIzquierdoAbajo {

  
    public static void main(String[] args) {
        // Definir variables
        int filas = 5;
        for (int i = 0; i < filas; i++){
            for(int j = 0; j < filas ; j++){
                if(j < filas - i){
                    System.out.print("X");
                }
            }
            System.out.println("");
        }
    }

}
