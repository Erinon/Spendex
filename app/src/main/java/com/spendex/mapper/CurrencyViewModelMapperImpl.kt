package com.spendex.mapper

import com.spendex.domain.model.Currency
import com.spendex.model.CurrencyViewModel

class CurrencyViewModelMapperImpl : CurrencyViewModelMapper {

    override fun currencyViewModelToCurrency(currencyViewModel: CurrencyViewModel) =
        when (currencyViewModel) {
            CurrencyViewModel.HRK -> Currency.HRK
            CurrencyViewModel.EUR -> Currency.EUR
        }

    override fun currencyToCurrencyViewModel(currency: Currency) =
        when (currency) {
            Currency.HRK -> CurrencyViewModel.HRK
            Currency.EUR -> CurrencyViewModel.EUR
        }
}
