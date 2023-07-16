package Quarto_Desafio;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class QuartoDesafio {

  public static void main(String[] args) {
    Scanner lerTeclado = new Scanner(System.in);
    String frases = "";
    System.out.println("Informe quantidae de frases");
    int qntLinhas = lerTeclado.nextInt();

    for (int i = 0; i <= qntLinhas; i++) {
      frases = lerTeclado.nextLine();
      String fraseDesifrada = desembaralhar(frases);
      System.out.println(fraseDesifrada);
    }
  }

  public static String desembaralhar(String frase) {
          StringBuilder fraseDecifrada = new StringBuilder();
      
          if (frase.length() >= 2 && frase.length() < 100) {
             
              for (int j = (frase.length() - 1) / 2; j > -1; j--) {
                  char c1 = frase.charAt(j);
                  fraseDecifrada.append(c1);
              }
      
              
              for (int i = frase.length() - 1; i > frase.length() / 2 - 1; i--) {
                  char c2 = frase.charAt(i);
                  fraseDecifrada.append(c2);
              }
          } else {
              return frase;
          }
      
          return fraseDecifrada.toString();
      }
      
}
