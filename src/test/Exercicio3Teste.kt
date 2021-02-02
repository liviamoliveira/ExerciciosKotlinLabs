package test

import main.exercicios.Exercicio3
import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class Exercicio3Teste {

        @Test
        fun `Dado que o usuário deseja calcular a Idade em dias, quando calcular, então deve exibir o resultado`(){
            val data = LocalDate.now()

            val totalDias = Exercicio3.calcularDias(data)

            assertEquals(totalDias,61)
        }

        @Test
        fun `Dado que o usuário colocou valor inválido, quando calcular, então não deve exibir o resultado`(){
            val data = LocalDate.MIN

            val totalDias = Exercicio3.calcularDias(data)

            assertFalse(totalDias > 0)
        }

    }