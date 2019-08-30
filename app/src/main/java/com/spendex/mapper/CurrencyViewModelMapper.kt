package com.spendex.mapper

import com.spendex.domain.model.Currency
import com.spendex.model.CurrencyViewModel

interface CurrencyViewModelMapper {

    fun currencyViewModelToCurrency(currencyViewModel: CurrencyViewModel): Currency

    fun currencyToCurrencyViewModel(currency: Currency): CurrencyViewModel
}
