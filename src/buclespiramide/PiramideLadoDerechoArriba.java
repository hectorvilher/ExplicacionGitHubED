/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package buclespiramide;

/**
 *
 * @author Usuario
 */
public class PiramideLadoDerechoArriba {

  
    public static void main(String[] args) {
        // Definir variables
        int fila = 5;//el numero de filas y de columnas en esta piramide es igual
        for(int i = 0; i < fila ; i++){
            for (int j=0; j< fila ; j++){
                if(j < (fila -1) -i){
                    System.out.print(" ");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println("");
        }
    }

}
