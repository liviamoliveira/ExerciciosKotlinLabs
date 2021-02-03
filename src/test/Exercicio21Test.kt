package test

import main.exercicios.Exercicio20
import main.exercicios.Exercicio21
import main.model.ProdutoEx21
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class Exercicio21Test {
    private lateinit var lista: List<ProdutoEx21>

    @Before
    fun setup(){
        val produto1 = Exercicio21.addProduto("ABCD", 5.30)
        val produto2 = Exercicio21.addProduto("XYPK", 6.00)
        val produto3 = Exercicio21.addProduto("KLMP", 3.20)
        val produto4 = Exercicio21.addProduto("QRST",2.50)

        lista = listOf(produto1, produto2, produto3, produto4)
    }

    @Test
    fun `Dado que o usuário deseja calcular o preço total da compra de 1 item, então deve exibir o resultado`(){

        val resultado = Exercicio21.calculoPrecoTotal(lista, "ABCD", 1)

        assertEquals(resultado, 5.30)
    }
    @Test
    fun `Dado que o usuário deseja calcular o preço total da compra de 2 itens diferentes, então deve exibir o resultado`(){

        val produto1 = Exercicio21.calculoPrecoTotal(lista, "ABCD", 1)
        val produto2 = Exercicio21.calculoPrecoTotal(lista, "XYPK", 3)

        val resultado = produto1 + produto2

        assertEquals(resultado, 23.30)
    }

    @Test
    fun `Dado que o usuário deseja calcular o preço total da compra de itens com código inexistente, então deve exibir o resultado 0`(){

        val resultado = Exercicio21.calculoPrecoTotal(lista, "ZXYA", 1)

        assertEquals(resultado, 0.00)

    }
    @Test
    fun `Dado que o usuário deseja calcular o preço total da compra de itens com quantidade 0, então deve exibir o resultado 0`(){

        val resultado = Exercicio21.calculoPrecoTotal(lista, "QRST", 0)

        assertEquals(resultado, 0.00)

    }

}