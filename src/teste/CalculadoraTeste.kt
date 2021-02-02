package teste

import main.exercicios.Calculadora
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculadoraTeste {

    @Test
    fun `Dado que o usuário deseja calcular dois números, então deve exibir o resultado`(){
        val resultadoCalculadora= Calculadora.somaNumeros(20.0, 10.0)

        assertEquals(resultadoCalculadora,30.0)
    }

    @Test
    fun `Dado que o usuário deseja calcular dois números negativos, então deve exibir o resultado`(){
        val resultadoCalculadora= Calculadora.somaNumeros(-20.0, -10.0)

        assertEquals(resultadoCalculadora,-30.0)
    }

}