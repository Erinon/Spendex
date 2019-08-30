package com.spendex.mapper

import com.spendex.domain.model.Spend
import com.spendex.model.SpendViewModel

interface SpendViewModelMapper {

    fun spendViewModeltoSpend(spendViewModel: SpendViewModel): Spend

    fun spendToSpendViewModel(spend: Spend): SpendViewModel

    fun spendListToSpendViewModelList(spendList: List<Spend>): List<SpendViewModel>
}
