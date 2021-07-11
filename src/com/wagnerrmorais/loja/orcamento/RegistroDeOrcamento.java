package com.wagnerrmorais.loja.orcamento;

import com.wagnerrmorais.loja.DomainException;
import com.wagnerrmorais.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {

         if(!orcamento.isFinalizado()){
            throw new DomainException("Orcamento não finalizado");
         }

        Map<String, Object>  dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        String url = "http://api.externa/orcamento";
        http.post(url, dados);
    }
}
