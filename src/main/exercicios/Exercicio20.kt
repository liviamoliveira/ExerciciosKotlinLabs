package main.exercicios

import main.model.Produto

object Exercicio20 {

    fun addProduto(codigo: Int, valor: Double): Produto{
        return Produto(codigo, valor)
    }

    fun calculoPrecoTotal(lista: List<Produto>, codigo: Int, qtdItem: Int): Double {

        val produto = lista.firstOrNull {it.codigo == codigo} ?: return 0.0

        return  produto.valor * qtdItem
    }
}