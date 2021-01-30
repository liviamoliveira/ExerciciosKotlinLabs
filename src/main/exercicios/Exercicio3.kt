package main.exercicios

import java.time.LocalDate


//Faça um algoritmo que leia a data de nascimento de uma pessoa expressa
//no formato (DD/MM/AAAA), e mostre-a expressa apenas em dias

object Exercicio3 {
    fun calcularDias(date: LocalDate): Int {
        val currentYear = LocalDate.now().year
        val diasTotal = date.dayOfMonth + (date.monthValue * 30) + (currentYear - date.year) * 365

        return diasTotal
    }
}