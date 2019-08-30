package com.spendex.domain.usecase

import io.reactivex.rxjava3.core.Single

interface SingleUseCase<R> {

    fun execute(): Single<R>
}
