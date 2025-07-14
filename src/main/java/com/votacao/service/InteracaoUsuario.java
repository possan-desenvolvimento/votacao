package com.votacao.service;

import com.votacao.util.ConsoleHelper;

public class InteracaoUsuario {
    public String lerNome() {
        return ConsoleHelper.lerString("Por favor, informe seu nome: ");
    }

    public int lerIdade() {
        return ConsoleHelper.lerInt("Por favor, informe sua idade: ");
    }

    public char lerSexo() {
        String sexoStr = ConsoleHelper.lerString("Informe o seu sexo ('M' para masculino, e 'F' para feminino. ");
        return sexoStr.toUpperCase().charAt(0);
    }

    public boolean perguntarSeQuerVotar() {
        String resposta = ConsoleHelper.lerString("Seu voto é opcional. Você deseja votar? Digite 'sim' ou 'não'");
        return resposta.equalsIgnoreCase("sim");
    }

    public void exibirMensagem(String mensagem){
        ConsoleHelper.exibirMensagem(mensagem);
    }


}
