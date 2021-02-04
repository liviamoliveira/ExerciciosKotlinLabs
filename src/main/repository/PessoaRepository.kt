package main.repository

import main.model.Pessoa

object PessoaRepository {

    private var listaPessoas: MutableList<Pessoa> = arrayListOf()

    private var sequenceId: Int = 0

    fun add(pessoa: Pessoa): Int {
        listaPessoas.add(pessoa)
        sequenceId++
        return sequenceId
    }

    fun getAll(): List<Pessoa> {
        return listaPessoas
    }

    fun getById(id: Int): Pessoa {
        return listaPessoas.first{ pessoa -> pessoa.id == id }
    }

    fun getByName(nome: String): List<Pessoa> {
        return listaPessoas.filter{ pessoa -> pessoa.nome == nome }
    }

    fun findByCPF(cpf: String): Pessoa {
        return listaPessoas.first{ pessoa ->  pessoa.cpf == cpf}
    }

    fun findBy(search: (pessoa: Pessoa) -> Boolean): List<Pessoa> {
        return listaPessoas.filter { search.invoke(it) }
    }

    fun update(pessoa: Pessoa){
        val posicao = listaPessoas.indexOf(pessoa)
        listaPessoas[posicao] = pessoa
    }

    fun delete(id: Int) {
        val pessoa = getById(id)
        listaPessoas.remove(pessoa)
    }
}