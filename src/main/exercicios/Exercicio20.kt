package main.exercicios

import main.model.ProdutoEx20

object Exercicio20 {

    fun addProduto(codigo: Int, valor: Double): ProdutoEx20{
        return ProdutoEx20(codigo, valor)
    }

    fun calculoPrecoTotal(lista: List<ProdutoEx20>, codigo: Int, qtdItem: Int): Double {

        val produto = lista.firstOrNull {it.codigo == codigo} ?: return 0.0

        return  produto.valor * qtdItem
    }
}