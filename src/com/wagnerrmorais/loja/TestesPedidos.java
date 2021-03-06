package com.wagnerrmorais.loja;

import com.wagnerrmorais.loja.pedido.GeraPedido;
import com.wagnerrmorais.loja.pedido.GeraPedidoHandler;
import com.wagnerrmorais.loja.pedido.acao.EnviarEmailPedido;
import com.wagnerrmorais.loja.pedido.acao.LogDePedido;
import com.wagnerrmorais.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = "Cliente com nome";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido(),
                        new LogDePedido()
                ));
        handler.execute(gerador);

    }
}
