package com.spendex.domain.usecase

import com.spendex.domain.model.Spend
import com.spendex.domain.repository.SpendRepository

class EditSpendUseCase(private val spendRepository: SpendRepository) :
    CompletableUseCaseWithParameter<Spend> {

    override fun execute(parameter: Spend) = spendRepository.editSpend(parameter)
}
