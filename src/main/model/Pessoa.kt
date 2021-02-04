package main.model

import java.math.BigDecimal
import java.time.LocalDate

data class Pessoa (
    val id: Int,
    val nome: String,
    val sexo: Sexo,
    val cpf: String,
    val rg: String,
    val dataNascimento: LocalDate,
    val altura: BigDecimal?,
    val peso: BigDecimal?,
    val telefone: String
)

