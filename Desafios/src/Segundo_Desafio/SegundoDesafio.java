package Segundo_Desafio;

import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {

  public static void main(String[] args) {
    double valorMonetario;
    Locale.setDefault(Locale.US);
    Scanner lerTeclado = new Scanner(System.in);
    double[] notas = { 100, 50, 20, 10, 5, 2 };
    double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

    System.out.println("Digite o valor monetario: ");
    valorMonetario = lerTeclado.nextDouble();

    dividirNotaseMoedas(notas, moedas, valorMonetario);



}
public static void dividirNotaseMoedas (double [] notas, double [] moedas, double valorMonetario) {
System.out.println("NOTAS:");
for (double nota : notas) {
    int quantidadeNotas = (int) (valorMonetario / nota);
    valorMonetario %= nota;
    System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota);
}
System.out.println("MOEDAS:");
for (double moeda : moedas) {
    int quantidadeMoedas = (int) (valorMonetario / moeda);
    valorMonetario %= moeda;
    System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda);
}
}

}
