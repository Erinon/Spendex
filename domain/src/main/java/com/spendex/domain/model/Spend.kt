package com.spendex.domain.model

import java.time.LocalDateTime

data class Spend(
    val id: Long,
    val amount: Float,
    val currency: Currency,
    val description: String,
    val time: LocalDateTime
)
