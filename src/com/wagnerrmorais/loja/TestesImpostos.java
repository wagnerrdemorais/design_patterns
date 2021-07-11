package com.wagnerrmorais.loja;

import com.wagnerrmorais.loja.imposto.CalculadoraDeImpostos;
import com.wagnerrmorais.loja.imposto.ISS;
import com.wagnerrmorais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
