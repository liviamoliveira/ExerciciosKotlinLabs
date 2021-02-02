package test

import main.exercicios.Exercicio2
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Exercicio2Test {

    @Test
    fun `Dado que o usuário deseja calcular o valor de D,quando calcular, então deve exibir o resultado`(){
        val resultadoR = Exercicio2.calculoR(20.0,10.0 )
        val resultadoS = Exercicio2.calculoS(10.0,30.0 )
        val resultadoD = Exercicio2.calculoD(resultadoR,resultadoS )

        assertEquals(resultadoR,900.0)
        assertEquals(resultadoS,1600.0)
        assertEquals(resultadoD, 1250.0)
    }

    @Test
    fun `Dado que o usuário deseja calcular o valor de D com valor de R negativo,quando calcular, então deve exibir o resultado`(){
        val resultadoR = Exercicio2.calculoR(-20.0,10.0 )
        val resultadoS = Exercicio2.calculoS(10.0,30.0 )
        val resultadoD = Exercicio2.calculoD(resultadoR,resultadoS )

        assertEquals(resultadoR,100.0)
        assertEquals(resultadoS,1600.0)
        assertEquals(resultadoD, 850.0)
    }
}