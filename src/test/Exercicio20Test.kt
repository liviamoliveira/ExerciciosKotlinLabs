package test

import main.exercicios.Exercicio20
import main.model.ProdutoEx20
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals


class Exercicio20Test {

    private lateinit var lista: List<ProdutoEx20>
    private lateinit var listaCodigo: MutableList<Int>
    private lateinit var listQtdItens: MutableList<Int>

    @Before
    fun setup() {
        val produto1 = Exercicio20.addProduto(1001, 5.32)
        val produto2 = Exercicio20.addProduto(1324, 6.45)
        val produto3 = Exercicio20.addProduto(6548, 2.37)
        val produto4 = Exercicio20.addProduto(987, 5.32)
        val produto5 = Exercicio20.addProduto(7623, 6.45)

        lista = listOf(produto1, produto2, produto3, produto4, produto5)

        listaCodigo = mutableListOf(1001, 1324, 1102)
        listQtdItens = mutableListOf(3, 4, 2)

    }


//    @Test
//    fun `Dado que o usuário deseja calcular o preço total da compra de 1 item, então deve exibir o resultado`(){
//
//         val resultado = Exercicio20.calculoPrecoTotal(lista, 1001, 1)
//
//        assertEquals(resultado, 5.32)
//}
//    @Test
//    fun `Dado que o usuário deseja calcular o preço total da compra de 2 itens diferentes, então deve exibir o resultado`(){
//
//        val produto1 = Exercicio20.calculoPrecoTotal(lista, 1324, 1)
//        val produto2 = Exercicio20.calculoPrecoTotal(lista, 987, 3)
//
//        val resultado = produto1 + produto2
//
//        assertEquals(resultado, 22.41)
//    }
//    @Test
//    fun `Dado que o usuário deseja calcular o preço total da compra de itens com código inexistente, então deve exibir o resultado 0`(){
//
//        val resultado = Exercicio20.calculoPrecoTotal(lista, 7623, 1)
//
//        assertEquals(resultado, 0.00)
//
//    }
//    @Test
//    fun `Dado que o usuário deseja calcular o preço total da compra de itens com quantidade 0, então deve exibir o resultado 0`(){
//
//        val resultado = Exercicio20.calculoPrecoTotal(lista, 1324, 0)
//
//        assertEquals(resultado, 0.00)
//
//    }

    @Test
    fun `Dado que o usuário deseja calcular o preço total da comprar varios itens, então deve exibir o resultado`() {

        listaCodigo.add(987)
        listQtdItens.add(5)

        val resultado = Exercicio20.calculoPrecoTotal(lista, listaCodigo, listQtdItens)

        assertEquals(resultado, 68.37)

    }
}