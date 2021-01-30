package main.exercicios

import kotlin.math.pow
import kotlin.math.sqrt

//Construa um algoritmo que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles. A
//fórmula que efetua tal cálculo é: d=(sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0)))

object Exercicio1 {

    fun calculoDistancia(x1: Double, x2: Double, y1: Double, y2: Double)
            = (sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0)))
}