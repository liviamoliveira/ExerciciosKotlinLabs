package main.exercicios

import java.math.RoundingMode

object Exercicio5 {
    fun somaNotas(n1: Double, n2: Double, n3: Double): Double {
        val resultadoMedia = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (10)
        return resultadoMedia.toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
    }
}