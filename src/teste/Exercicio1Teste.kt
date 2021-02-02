package teste

import main.exercicios.Exercicio1
import org.junit.jupiter.api.Test
import kotlin.math.roundToLong
import kotlin.test.assertEquals

class Exercicio1Teste {

    @Test
    fun `Dado que o usuário deseja calcular a distância,quando calcular, então deve exibir o resultado`(){
        val resultadoRaiz = Exercicio1.calculoDistancia(20.0, 10.0, 20.0, 40.0)

        assertEquals(resultadoRaiz.roundToLong(),22)
    }

    @Test
    fun `Dado que o usuário deseja calcular uma distância negativa,quando calcular, então deve exibir o resultado`(){
        val resultadoRaiz = Exercicio1.calculoDistancia(-20.0, 10.0, -20.0, 40.0)

        assertEquals(resultadoRaiz.roundToLong(),67)
    }
}