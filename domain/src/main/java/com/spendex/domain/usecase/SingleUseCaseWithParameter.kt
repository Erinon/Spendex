package com.spendex.domain.usecase

import io.reactivex.Single

interface SingleUseCaseWithParameter<P, R> {

    fun execute(parameter: P): Single<R>
}
