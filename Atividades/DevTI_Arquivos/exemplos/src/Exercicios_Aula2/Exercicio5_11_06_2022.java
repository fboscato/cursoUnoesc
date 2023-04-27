package Exercicios_Aula2;

import java.util.Scanner;

public class Exercicio5_11_06_2022 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;
        double valor = 1;
        double valorMaior = 0;
        double valorMenor = 0;
        //for(;valor!=0;) 
        while (valor <= 5){
            System.out.println("Digite os valores :");
            valor = entrada.nextDouble();
            if(valor > valorMaior && valor!=0) {
                valorMaior = valor;

            }
            if(valor < valorMenor && valor!=0) {
                valorMenor = valor;
            }   
        }
        System.out.println("Maior valor: "+ valorMaior);
        System.out.println("Menor valor: "+ valorMenor);

    }

}
