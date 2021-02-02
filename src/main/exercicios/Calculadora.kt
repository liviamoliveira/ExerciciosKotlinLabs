package main.exercicios

import java.math.RoundingMode

object Calculadora {
    fun somaNumeros(n1: Double, n2: Double)
            = (n1 + n2).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()

}