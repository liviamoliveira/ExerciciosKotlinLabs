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

    @Test
    fun `Dado que o usuário deseja calcular n1=25 e n2=99, então deve exibir o resultado=124`(){
        val resultadoCalculadora= Calculadora.somaNumeros(25.0, 99.0)

        assertEquals(resultadoCalculadora,124.0)
    }

    @Test
    fun `Dado que o usuário deseja calcular n1=-15 e n2=-8, então deve exibir o resultado=-23`(){
        val resultadoCalculadora= Calculadora.somaNumeros(-15.0, -8.0)

        assertEquals(resultadoCalculadora,-23.0)
    }

    @Test
    fun `Dado que o usuário deseja calcular n1=1,5 e n2=2,2, então deve exibir o resultado=3,7`(){
        val resultadoCalculadora= Calculadora.somaNumeros(1.5, 2.2)

        assertEquals(resultadoCalculadora,3.7)
    }

    @Test
    fun  `Dado que o usuário deseja calcular n1=-10,1 e n2=5, então deve exibir o resultado=-5,1`(){
        val resultadoCalculadora= Calculadora.somaNumeros(-10.1, 5.0)

        assertEquals(resultadoCalculadora,-5.1)
    }

}