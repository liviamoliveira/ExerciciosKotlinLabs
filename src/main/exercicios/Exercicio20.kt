package main.exercicios

import main.model.ProdutoEx20
import java.math.RoundingMode

object Exercicio20 {

    fun addProduto(codigo: Int, valor: Double): ProdutoEx20 {
        return ProdutoEx20(codigo, valor)
    }

    fun calculoPrecoTotal(lista: List<ProdutoEx20>, listaCodigo: List<Int>, ListaQtdItem: List<Int>): Double {

        var result = 0.0

        for (i in listaCodigo.indices) {
            val produto = lista.firstOrNull { it.codigo == listaCodigo[i] }

            if (produto != null)
                result += produto.valor * ListaQtdItem[i]
        }

        return result.toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
    }
}