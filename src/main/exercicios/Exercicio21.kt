package main.exercicios

import main.model.ProdutoEx21

object Exercicio21 {

    fun addProduto(codigo: String, valor: Double): ProdutoEx21 {
        return ProdutoEx21(codigo, valor)
    }

    fun calculoPrecoTotal(lista: List<ProdutoEx21>, codigo: String, qtdItem: Int): Double {

        val produto = lista.firstOrNull {it.codigo == codigo} ?: return 0.0

        return  produto.valor * qtdItem
    }
}