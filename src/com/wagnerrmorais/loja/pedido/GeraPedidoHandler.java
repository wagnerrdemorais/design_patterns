package com.wagnerrmorais.loja.pedido;

import com.wagnerrmorais.loja.orcamento.ItemOrcamento;
import com.wagnerrmorais.loja.orcamento.Orcamento;
import com.wagnerrmorais.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

//exemplo observer
public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
