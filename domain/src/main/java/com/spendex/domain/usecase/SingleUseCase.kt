package com.spendex.domain.usecase

import io.reactivex.Single

interface SingleUseCase<R> {

    fun execute(): Single<R>
}
