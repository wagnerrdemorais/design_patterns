package com.wagnerrmorais.loja.pedido.acao;

import com.wagnerrmorais.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados do cliente: " + pedido.getCliente());
    }
}
