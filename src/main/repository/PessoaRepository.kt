package main.repository

import main.model.Pessoa
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper

class PessoaRepository {

    private lateinit var listaPessoas: MutableList<Pessoa>

    fun add(pessoa: Pessoa) {
        listaPessoas.add(pessoa)
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
    fun findBy(){}

    fun update(pessoa: Pessoa){
        val posicao = listaPessoas.indexOf(pessoa)
        listaPessoas[posicao] = pessoa
    }

    fun delete(id: Int) {
        val pessoa = getById(id)
        listaPessoas.remove(pessoa)
    }
}