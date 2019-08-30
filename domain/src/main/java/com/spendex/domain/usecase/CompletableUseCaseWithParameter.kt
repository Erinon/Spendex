package com.spendex.domain.usecase

import io.reactivex.rxjava3.core.Completable

interface CompletableUseCaseWithParameter<P> {

    fun execute(parameter: P): Completable
}
