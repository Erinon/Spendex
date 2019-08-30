package com.spendex.domain.model

import java.util.*

data class Spend(
    val id: Long,
    val amount: Float,
    val currency: Currency,
    val description: String,
    val date: Date
)
