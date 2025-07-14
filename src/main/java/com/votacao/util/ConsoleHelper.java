package com.votacao.util;

import java.util.Scanner;

public class ConsoleHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static String lerString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int lerInt(String prompt){
        System.out.println(prompt);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public static void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
