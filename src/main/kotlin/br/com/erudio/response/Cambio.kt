package br.com.erudio.response

import jakarta.persistence.*
import java.math.BigDecimal
import kotlin.jvm.Transient


data class Cambio(
    var id: Long = 0,
    var from: String = "",
    var to: String = "",
    var conversionFactor: Double,
    var convertedValue: Double,
    var environment: String? = ""
)