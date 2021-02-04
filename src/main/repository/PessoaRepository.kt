package main.repository

import main.model.Pessoa

object PessoaRepository {

    private var listaPessoas: MutableList<Pessoa> = arrayListOf()

    private var sequenceId: Int = 0

    fun add(pessoa: Pessoa): Int {
        verificaDados(pessoa)
        listaPessoas.add(pessoa)
        sequenceId++
        return sequenceId
    }

    fun getAll(): List<Pessoa> {
        return listaPessoas
    }

    fun getById(id: Int): Pessoa {
        return listaPessoas.first { pessoa -> pessoa.id == id }
    }

    fun getByName(nome: String): List<Pessoa> {
        return listaPessoas.filter { pessoa -> pessoa.nome == nome }
    }

    fun findByCPF(cpf: String): Pessoa {
        return listaPessoas.first { pessoa -> pessoa.cpf == cpf }
    }

    fun findBy(search: (pessoa: Pessoa) -> Boolean): List<Pessoa> {
        return listaPessoas.filter { search.invoke(it) }
    }

    fun update(pessoa: Pessoa) {
        val posicao = listaPessoas.indexOf(pessoa)
        listaPessoas[posicao] = pessoa
    }

    fun delete(id: Int) {
        val pessoa = getById(id)

        if (pessoa != null)
            listaPessoas.remove(pessoa)
    }

    private fun verificaDados(pessoa: Pessoa): Boolean {

        if (!verificaNome(pessoa))
            return false

        if (!verificaCPF(pessoa))
            return false

        if (!verificaRg(pessoa))
            return false

        if (!verificaNumeroTelefone(pessoa))
            return false

        return true
    }

    private fun verificaNome(pessoa: Pessoa): Boolean {
        val listaNome = pessoa.nome.split(" ")

        if (listaNome.isEmpty()) return false

        if (listaNome.size < 2) return false

        if (listaNome[0].isBlank() && listaNome[1].isBlank()) return false

        if (listaNome[0].length <= 2 && listaNome[1].length <= 2) return false

        return true
    }

    private fun verificaCPF(pessoa: Pessoa): Boolean {
        val cpf = pessoa.cpf.replace(".", "").replace("-", "")

        if (cpf.length != 11) return false

        if (listaPessoas.first { p -> p.cpf == pessoa.cpf } != null) return false

        return true
    }

    private fun verificaRg(pessoa: Pessoa): Boolean {
        val verificaRg = pessoa.rg.replace(".", "").replace("-", "")

        if (verificaRg.length < 6)
            return false

        return true
    }

    private fun verificaNumeroTelefone(pessoa: Pessoa): Boolean {
        val telefone = pessoa.telefone

        if (telefone.isBlank()) return false

        return true
    }

}