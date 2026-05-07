/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclespiramide;

/**
 *
 * @author Usuario
 */
public class PiramideLadoDerechoAbajo {

    public static void main(String[] args) {
        // Definir variables
        int fila = 5;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < fila; j++) {
                if(j >= i){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
