package main

import main.exercicios.*
import main.model.Pessoa
import main.model.Sexo
import main.repository.PessoaRepository
import java.math.BigDecimal
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    var sair = false

    while (!sair) {

        val menu = readLineInt("Escolha exercícios de 1 a 9 ou digite 10 para sair:")

        when (menu) {
            1 -> exercicio1()
            2 -> exercicio2()
            3 -> exercicio3()
            4 -> exercicio4()
            5 -> exercicio5()
            6 -> calculadora()
            7 -> exercicio20()
            8 -> exercicio21()
            9 -> exercicioClasses()
            10 -> sair = true
            else -> println("Digite uma opção de 1 a 10")
        }
    }
}

private fun exercicioClasses(){

    val pessoa1 = Pessoa(
        12, "João",
        Sexo.MASCULINO,
        "000.001.000-34",
        "MG-01.023.123",
        LocalDate.now(),
        BigDecimal("1.52"),
        BigDecimal("52.5"),
        "0123-456789")

    PessoaRepository.add(pessoa1)

    val pessoaAdd = PessoaRepository.getById(pessoa1.id)

    val resultadoIMC = CalculoIMC.formula(pessoa1)
    val pessoa = readLineTexto("Olá ${pessoa1.nome}, seu IMC é de: $resultadoIMC")

    val alturaNula = readLineTexto("Olá ${pessoa1.nome}, você não possui altura cadastrada.")
    val pesoNula = readLineTexto("Olá ${pessoa1.nome}, você não possui peso cadastrado.")


}

private fun exercicio21(){
    val produto1 = Exercicio21.addProduto("ABCD", 5.30)
    val produto2 = Exercicio21.addProduto("XYPK", 6.00)
    val produto3 = Exercicio21.addProduto("KLMP", 3.20)
    val produto4 = Exercicio21.addProduto("QRST",2.50)

    val lista = listOf(produto1, produto2, produto3, produto4)

    val codigo = readLineTexto("Digite o código do produto:")

    val qtdItem = readLineInt("Digite a quantidade de produtos que deseja deste item:")

    val totalCompra = Exercicio21.calculoPrecoTotal(lista, codigo, qtdItem)

    println("A sua compra ficou no valor de: R$ $totalCompra")
    println("Fim! Obrigada")

}


private fun exercicio20(){
    val produto1 = Exercicio20.addProduto(1001, 5.32)
    val produto2 = Exercicio20.addProduto(1324, 6.45)
    val produto3 = Exercicio20.addProduto(6548, 2.37)
    val produto4 = Exercicio20.addProduto(987,5.32)
    val produto5 = Exercicio20.addProduto(7623, 6.45)

    val lista = listOf(produto1, produto2, produto3, produto4, produto5)


//
//    val codigo = readLineInt("Digite o código do produto:")
//
//    val qtdItem = readLineInt("Digite a quantidade de produtos que deseja deste item:")
//
//    val totalCompra = Exercicio20.calculoPrecoTotal(lista, codigo, qtdItem)
//
//    println("A sua compra ficou no valor de: R$ $totalCompra")
//    println("Fim! Obrigada")

}

private fun exercicio5() {
    val n1 = readLineValor("Digite a nota 1:")

    val n2 = readLineValor("Digite a nota 2:")

    val n3 = readLineValor("Digite a nota 3:")

    val resultadoMediaPonderada = Exercicio5.somaNotas(n1,n2,n3)

    println("A média monderada do aluno é: $resultadoMediaPonderada")
    println("Fim! Obrigada")
}

private fun calculadora() {
    val n1 = readLineValor("Digite um número:")

    val n2 = readLineValor("Digite outro valor para somar:")

    val resultadoCalculadora = Calculadora.somaNumeros(n1,n2)

    println("A soma dos números é de: $resultadoCalculadora")
    println("Fim! Obrigada")
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

