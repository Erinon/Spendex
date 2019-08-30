package com.spendex.domain.usecase

import com.spendex.domain.repository.SpendRepository

class RemoveSpendUseCase(private val spendRepository: SpendRepository) :
    CompletableUseCaseWithParameter<Long> {

    override fun execute(parameter: Long) = spendRepository.removeSpend(parameter)
}
