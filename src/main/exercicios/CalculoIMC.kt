package main.exercicios

import main.model.Pessoa
import main.model.ProdutoEx20
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

object CalculoIMC {
    fun formula(pessoa: Pessoa): Double {
        val peso = pessoa.peso
        val altura = pessoa.altura

        if (peso == null) return 0.0

        if (altura == null) return 0.0

        return (peso / (altura.pow(2))).setScale(2, RoundingMode.UP).toDouble()
    }

}
