/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg01;

import java.util.Scanner;

public class Exercicio01 {
    
//finalizado
    
    public static boolean nmrPrft(int nmr1) {

        if (nmr1 <= 1) {
            return false;
        }
        int somaD = 0;
        for (int i = 1; i < nmr1; i++) {
            if (nmr1 % i == 0) {
                somaD += i;
            }
        }
        return somaD == nmr1;

    }

    public static void main(String[] args) {

        Scanner objNr = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int nmr1 = objNr.nextInt();

        System.out.println(nmrPrft(nmr1));
    }

}
