package com.votacao.service;

import com.votacao.model.Eleitor;
import com.votacao.model.StatusVotacao;

public class RegrasVotacao{

    public StatusVotacao verificarStatusVotacao(Eleitor eleitor) {
        int idade = eleitor.getIdade();
        char sexo = eleitor.getSexo();

        if (idade < 16) {
            return StatusVotacao.NAO_ELEGIVEL;
        } else if (idade >= 18 && idade < 62) {
            return StatusVotacao.OBRIGATORIO;
        } else if ((idade >= 16 && idade <= 17) ||
                  (idade == 62 && sexo == 'F') ||
                  (idade >= 65 && sexo == 'M')) {

            return StatusVotacao.OPCIONAL;
        } else {
            return StatusVotacao.OBRIGATORIO;
        }
    }





}
