package com.spendex.domain.usecase

import com.spendex.domain.model.Spend
import com.spendex.domain.repository.SpendRepository

class RemoveSpendUseCase(private val spendRepository: SpendRepository) :
    CompletableUseCaseWithParameter<Spend> {

    override fun execute(parameter: Spend) = spendRepository.removeSpend(parameter)
}
