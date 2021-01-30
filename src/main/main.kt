package main

import main.exercicios.Exercicio1
import main.exercicios.Exercicio2
import main.exercicios.Exercicio3
import main.exercicios.Exercicio4
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    var sair = false

    while (!sair){
        when {
            readLineInt("Escolha exercícios de 1 a 4 ou digite 5 para sair:") == 1 -> exercicio1()
            readLineInt("Escolha exercícios de 1 a 4 ou digite 5 para sair:") == 2 -> exercicio2()
            readLineInt("Escolha exercícios de 1 a 4 ou digite 5 para sair:") == 3 -> exercicio3()
            readLineInt("Escolha exercícios de 1 a 4 ou digite 5 para sair:") == 4 -> exercicio4()
            readLineInt("Escolha exercícios de 1 a 4 ou digite 5 para sair:") == 5 -> sair = true
            else -> println("Digite uma opção de 1 a 5")
        }
    }
}

private fun exercicio4(){

    val diasInformados = readLineLong("Digite a quantidade de dias que você viveu:")

    val dataNascimento = Exercicio4.calcularDataNascimento(diasInformados)

    val calendar = Calendar.getInstance()
    calendar[dataNascimento.year,dataNascimento.month.value] = dataNascimento.dayOfMonth

    val formato = DateUtils.toSimpleString(calendar.time)

    println("Você nasceu em: $formato")
    println("Fim! Obrigada")

}

private fun exercicio3() {
    val dataDigitada = readLineTexto("Digite a sua data de nascimento no formato DD/MM/AAAA:")

    val localDate = LocalDate.parse(dataDigitada, DateTimeFormatter.ofPattern("dd/MM/yyyy"))

    val totalDias = Exercicio3.calcularDias(localDate)

    println("Você possui: $totalDias dias de vida")
    println("Fim! Obrigada")
}

private fun exercicio2() {
    val a = readLineValor("Digite o valor de A:")

    val b = readLineValor("Digite o valor de B:")

    val c = readLineValor("Digite o valor de C:")

    val resultadoR = Exercicio2.calculoR(a, b)

    val resultadoS = Exercicio2.calculoS(b, c)

    val resultadoD = Exercicio2.calculoD(resultadoR, resultadoS)

    println("O valor de D é: $resultadoD")
    println("Fim! Obrigada")
}

private fun exercicio1() {
    val x1 = readLineValor("Digite o valor de x1:")

    val x2 = readLineValor("Digite o valor de x2:")

    val y1 = readLineValor("Digite o valor de y1:")

    val y2 = readLineValor("Digite o valor de y2:")

    val resultadoRaiz = Exercicio1.calculoDistancia(x1, x2, y1, y2)

    println("A distancia entre os dois pontos é de: $resultadoRaiz")
    println("Fim! Obrigada")
}

fun readLineValor(mensagem: String): Double{
    print(mensagem)
    return readLine()?.toDouble() ?: 0.0
}
fun readLineInt(mensagem: String): Int{
    print(mensagem)
    return readLine()?.toInt() ?: 0
}
fun readLineTexto(mensagem: String): String {
    print(mensagem)
    return readLine().toString()
}
fun readLineLong(mensagem: String): Long {
    print(mensagem)
    return readLine()?.toLong() ?: 0
}

