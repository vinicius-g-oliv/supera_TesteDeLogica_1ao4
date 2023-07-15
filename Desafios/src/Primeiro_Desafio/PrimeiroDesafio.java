package Primeiro_Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiroDesafio {

  public static void main(String[] args) {
    int qntEntradas;
    int contador = 0;
    boolean entradaValida = false;
    Scanner lerTeclado = new Scanner(System.in);
    ArrayList<Integer> par = new ArrayList();
    ArrayList<Integer> impar = new ArrayList();

    int numeroPositivo;
    System.out.println("Digite um número inteiro positivo. Esse número será a quantidade total de entradas.");
    
    while (entradaValida == false) {
    qntEntradas = lerTeclado.nextInt();
    
    if (qntEntradas >= 1 && qntEntradas <= 100000) {
      while (contador < qntEntradas) {
        numeroPositivo = lerTeclado.nextInt();
        if (numeroPositivo >= 1) {
          parOuImpar(numeroPositivo, par, impar);
          contador++;
         
        } else {
          System.out.println("esse valor não e um inteiro positivo");
        }
      }
      crescenteDecrecente(par, impar);
      System.out.println("\n");
      imprimir(par);
      imprimir(impar);
      entradaValida = true;
      lerTeclado.close();
    } else {
      System.out.println("valor inválido");
    }
  }
  }

  public static void parOuImpar(int numero,ArrayList<Integer> par,ArrayList<Integer> impar) {
    if (numero % 2 == 0) {
      par.add(numero);
    
    } else {
      impar.add(numero);
    }
   
  }
  public static void crescenteDecrecente(ArrayList<Integer> par,ArrayList<Integer> impar ) {
          Collections.sort(par);        
          Collections.sort(impar, Collections.reverseOrder()); 
  }
  public static void imprimir (ArrayList <Integer> lista) {
          for(int i = 0 ; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
          }
  }
}
