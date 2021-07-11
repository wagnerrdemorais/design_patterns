package com.wagnerrmorais.loja.pedido.acao;

import com.wagnerrmorais.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido do cliente: " + pedido.getCliente());
    }

}
