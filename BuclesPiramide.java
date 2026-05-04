/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclespiramide;

import java.util.Scanner;

/**
 * Escribe un programa quie pinte una pirámide rellenacon un carácter
 * introducido por teclado que podrá ser una letra, un numero o un simbolo como
 * *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menu
 * elegir si el vertice de la piramide está apuntando hacie arriba, hacia abajo,
 * hacia la izquierda o hacia la derecha.
 *
 * @author Usuario
 */
public class BuclesPiramide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int numPisos = 5;
//        for (int  i = 0 ; i < numPisos; i++){
//            
//            for(int j = 0 ; j <= i ; j++){
//                System.out.print("x");
//            }
//        
//            System.out.println("");
//        }

        int numPisos = 3;
        int numColumnas = numPisos + (numPisos - 1);
        System.out.println("Escribe un símbolo y te hago una pirámide con él");
        String relleno = sc.nextLine();
        char simbolo = relleno.charAt(0);

        for (int i = 0; i < numPisos; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if ((j >= (numColumnas / 2) - i) && (j <= (numColumnas / 2) + i)) {
                    System.out.print(simbolo);
                }else{
                    System.out.print(" ");
                }
              
            }
            System.out.println("");
        }
    }

}


