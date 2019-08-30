package com.spendex.domain.repository

import com.spendex.domain.model.Spend
import io.reactivex.Completable
import io.reactivex.Single
import java.util.*

interface SpendRepository {

    fun getSpendsForDate(date: Date): Single<List<Spend>>

    fun addSpend(spend: Spend): Completable

    fun editSpend(spend: Spend): Completable

    fun removeSpend(spend: Spend): Completable
}
