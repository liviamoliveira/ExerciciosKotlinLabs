package main.exercicios

import main.model.Pessoa
import java.math.RoundingMode

object CalculoIMC {
    fun formula(pessoa: Pessoa): Double {
        val peso = pessoa.peso
        val altura = pessoa.altura

        if (peso == null) return 0.0

        if (altura == null) return 0.0

        return (peso / (altura.pow(2))).setScale(2, RoundingMode.UP).toDouble()
    }

}
