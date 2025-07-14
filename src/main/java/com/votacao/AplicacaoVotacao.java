package com.votacao;

import com.votacao.model.Eleitor;
import com.votacao.model.StatusVotacao;
import com.votacao.service.InteracaoUsuario;
import com.votacao.service.RegrasVotacao;
import com.votacao.util.ConsoleHelper;

import java.security.interfaces.ECKey;

public class AplicacaoVotacao {
    public static void main(String[] args) {

        InteracaoUsuario interacaoUsuario = new InteracaoUsuario();
        RegrasVotacao regrasVotacao = new RegrasVotacao();
        ConsoleHelper .exibirMensagem("Seja bem vindo ao Sistema de Verificação de Voto!");

        String nome = interacaoUsuario.lerNome();
        int idade = interacaoUsuario.lerIdade();
        char sexo = interacaoUsuario.lerSexo();

        Eleitor eleitor = new Eleitor(nome, idade, sexo);

        StatusVotacao status = regrasVotacao.verificarStatusVotacao(eleitor);

        switch (status) {
            case OBRIGATORIO:
                interacaoUsuario.exibirMensagem(eleitor.getNome() + ", seu voto é OBRIGATÓRIO. ");
                break;
            case OPCIONAL:
                interacaoUsuario.exibirMensagem(eleitor.getNome() + ", seu voto é OPCIONAL. ");
                break;
            case NAO_ELEGIVEL:
                interacaoUsuario.exibirMensagem(eleitor.getNome() + ", você não é elegível para votar. ");
                break;
            case PERGUNTAR_DESEJA_VOTAR:
                interacaoUsuario.exibirMensagem(eleitor.getNome() + ", de acordo com a sua idade, e sexo, seu voto é OPCIONAL. ");
                boolean querVotar = interacaoUsuario.perguntarSeQuerVotar();
                if (querVotar){
                    interacaoUsuario.exibirMensagem("Ótimo, Obrigado por votar!");
                } else {
                    interacaoUsuario.exibirMensagem("Tudo bem. Obrigado por usar o sistema. ");
                }
                break;
            default:
                interacaoUsuario.exibirMensagem("Status de votação desconhecido. Houve um erro na sua resposta. ");
                break;
        }

        ConsoleHelper.exibirMensagem("Fim da verificação. Até a próxima. ");

    }
}