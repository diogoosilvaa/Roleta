package br.senai.sp.roleta;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta russa
 * Data: 17/08/2023
 * Autor: Diogo silva
 *
 * */

public class Roleta {
    public static void main(String[] args) {
        /** declarar as variaveis */

        int userNumber,numberRandom;
        String nome;
        boolean continuar = true;

        /** Instaciar Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instanciar Random */
        Random random = new Random();

        while (continuar) {

            /**Coleta dados */
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("--------- Bem vindo --------");
            System.out.println("Qual é o seu nome: ");
            nome = teclado.next();
            System.out.println("Ola, " + nome + " Digite seu numero da sorte [1-10]: ");
            userNumber = teclado.nextInt();
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/--/-/");

            /** Logica do jogo*/

            numberRandom = random.nextInt(10) + 1;

            if (userNumber == numberRandom) {
                continuar = false;
                System.out.println("voce perdeu");
            }else {
                System.out.println("Parabens voce Ganhou");
            }
        }
    }
}
