package com.spendex.domain.usecase

import com.spendex.domain.model.Spend
import com.spendex.domain.repository.SpendRepository
import java.util.*

class GetSpendsForDateUseCase(private val spendRepository: SpendRepository) :
    SingleUseCaseWithParameter<Date, List<Spend>> {

    override fun execute(parameter: Date) = spendRepository.getSpendsForDate(parameter)
}
