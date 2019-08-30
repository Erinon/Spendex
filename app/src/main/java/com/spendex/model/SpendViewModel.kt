package com.spendex.model

import java.util.*

data class SpendViewModel(
    val id: Long,
    val amount: Float,
    val currency: CurrencyViewModel,
    val description: String,
    val date: Date
)
