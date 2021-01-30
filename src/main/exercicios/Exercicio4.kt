package main.exercicios

import java.time.LocalDate

//Faça um algoritmo que leia a idade de uma pessoa expressa em dias e
//mostre-a expressa em anos, meses e dias.

object Exercicio4 {

    fun calcularDataNascimento(numeroDias: Long): LocalDate {
        return LocalDate.now().minusDays(numeroDias)
    }
}