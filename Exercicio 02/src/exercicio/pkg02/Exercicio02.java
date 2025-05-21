
package exercicio.pkg02;

import java.util.Scanner;


public class Exercicio02 {

  
  public static void main(String[] args) {

        char[] vetor = {'a', 'e', 'i', 'o', 'u'};

        Scanner objNr = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String vogal = objNr.nextLine();

        String resultado = (vogais(vogal));
        System.out.println("Palavra atualizada: " + resultado);
    }

    public static String vogais(String vogal) { 

        String palavraM = "";

        String vogalAtt = vogal.toLowerCase();
        for (int i = 0; i < vogalAtt.length(); i++) {
        char Vletra = vogalAtt.charAt(i);
        
        if(Vletra == 'a' || Vletra == 'e' || Vletra == 'i' || Vletra == 'o' || Vletra == 'u'){
            palavraM += "*";

        }
        else {
            palavraM += Vletra;
        }
        }
        return palavraM;
    }
}

    
  
    
