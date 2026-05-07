/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package buclespiramide;

/**
 *
 * @author Usuario
 */
public class PiramideArribaCentro {

  
    public static void main(String[] args) {
        // Definir variables
        int filas = 3;
        int columnas = 5;
        for(int i = 0 ; i < filas ; i++){
            for(int j = 0; j < columnas ; j++){
                if((j >= (columnas/2) - i) && (j <= (columnas / 2) + i)){
                    System.out.print("x");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }

}
