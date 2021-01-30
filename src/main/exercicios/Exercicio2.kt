package main.exercicios

import kotlin.math.pow

//Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão: D= R+S / 2, onde R= (A + B).pow(2.0) e S= (B + C).pow(2.0)

object Exercicio2 {
    fun calculoR(a: Double, b: Double)
            = (a + b).pow(2.0)
    fun calculoS(b: Double, c: Double)
            = (b + c).pow(2.0)
    fun calculoD(r: Double, s: Double)
            = (r + s) / 2
}