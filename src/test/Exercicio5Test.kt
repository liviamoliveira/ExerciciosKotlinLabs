package test

import main.exercicios.Exercicio5
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Exercicio5Test {
    @Test
    fun `Dado que o usuário deseja calcular a media entre 3 notas, então deve exibir o resultado`(){
        val resultadoMediaPonderada= Exercicio5.somaNotas(8.0, 7.0, 9.0)

        assertEquals(resultadoMediaPonderada,82.00)
    }

    @Test
    fun `Dado que o usuário deseja calcular a media entre 3 notas decimais, então deve exibir o resultado`(){
        val resultadoMediaPonderada= Exercicio5.somaNotas(3.2, 4.7, 9.6)

        assertEquals(resultadoMediaPonderada,6.85)
    }

    @Test
    fun `Dado que o usuário deseja calcular a media entre notas negativas, então deve exibir o resultado`() {
        val resultadoMediaPonderada = Exercicio5.somaNotas(-5.8, -3.4, 1.6)

        assertEquals(resultadoMediaPonderada, -1.38)

    }
}