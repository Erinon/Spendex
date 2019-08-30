package com.spendex.domain.usecase

import io.reactivex.rxjava3.core.Single

interface SingleUseCaseWithParameter<P, R> {

    fun execute(parameter: P): Single<R>
}
