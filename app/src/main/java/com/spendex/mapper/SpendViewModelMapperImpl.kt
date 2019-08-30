package com.spendex.mapper

import com.spendex.domain.model.Spend
import com.spendex.model.SpendViewModel

class SpendViewModelMapperImpl(private val currencyViewModelMapper: CurrencyViewModelMapper) :
    SpendViewModelMapper {

    override fun spendViewModeltoSpend(spendViewModel: SpendViewModel) =
        with(spendViewModel) {
            Spend(
                id,
                amount,
                currencyViewModelMapper.currencyViewModelToCurrency(currency),
                description,
                date
            )
        }

    override fun spendToSpendViewModel(spend: Spend) =
        with(spend) {
            SpendViewModel(
                id,
                amount,
                currencyViewModelMapper.currencyToCurrencyViewModel(currency),
                description,
                date
            )
        }

    override fun spendListToSpendViewModelList(spendList: List<Spend>) =
        spendList.map(this::spendToSpendViewModel)
}
