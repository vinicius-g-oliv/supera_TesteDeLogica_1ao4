package Terceiro_Desafio;

import java.util.Scanner;

public class TerceiroDesafio {

  public static void main(String[] args) {

    Scanner lerEntrada = new Scanner(System.in);
    int valorAlvo;
    int tamanhoArray;

    System.out.println("Digite o tamanho do array");
    tamanhoArray = lerEntrada.nextInt();
    System.out.println("Preencha o array:");
    int[] array = new int[tamanhoArray];
    preencherArray(array);
    System.out.println("Valor alvo:");
    valorAlvo = lerEntrada.nextInt();

    System.out.println("\n" + buscarPares(array, valorAlvo));
  }

  public static void preencherArray(int[] array) {
    Scanner lerTeclado = new Scanner(System.in);
    for (int i = 0; i <= array.length - 1; i++) {
      array[i] = lerTeclado.nextInt();
    }
  }

  public static int buscarPares(int[] array, int valorAlvo) {
    int contador = 0;
    //Verifica se a diferença dos valores do array é igual ao valor alvo
    for (int i = 0; i <= array.length - 1; i++) {
      for (int j = 0; j <= array.length - 1; j++) {
        if (array[i] - array[j] == valorAlvo) {
          contador++;
        }
      }
    }
    return contador;
  }
}
