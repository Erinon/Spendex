package com.spendex.domain.usecase

import io.reactivex.Completable

interface CompletableUseCaseWithParameter<P> {

    fun execute(parameter: P): Completable
}
