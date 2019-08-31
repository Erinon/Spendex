package com.spendex.koin

import androidx.room.Room
import com.spendex.data.database.AppDatabase
import com.spendex.data.database.mapper.DbDateTimeMapper
import com.spendex.data.database.mapper.DbDateTimeMapperImpl
import com.spendex.data.database.mapper.DbSpendMapper
import com.spendex.data.database.mapper.DbSpendMapperImpl
import com.spendex.data.repository.SpendRepositoryImpl
import com.spendex.domain.repository.SpendRepository
import com.spendex.domain.usecase.AddSpendUseCase
import com.spendex.domain.usecase.EditSpendUseCase
import com.spendex.domain.usecase.GetSpendsForDateUseCase
import com.spendex.domain.usecase.RemoveSpendUseCase
import com.spendex.mapper.CurrencyViewModelMapper
import com.spendex.mapper.CurrencyViewModelMapperImpl
import com.spendex.mapper.SpendViewModelMapper
import com.spendex.mapper.SpendViewModelMapperImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val applicationModule = module {

    // room
    single { Room.databaseBuilder(androidContext(), AppDatabase::class.java, "spend-db").build() }
    single { get<AppDatabase>().spendDao() }

    // repository
    single<SpendRepository> { SpendRepositoryImpl(get(), get()) }

    // mapper
    single<DbDateTimeMapper> { DbDateTimeMapperImpl }
    single<DbSpendMapper> { DbSpendMapperImpl(get()) }
    single<CurrencyViewModelMapper> { CurrencyViewModelMapperImpl() }
    single<SpendViewModelMapper> { SpendViewModelMapperImpl(get()) }

    // use case
    single { AddSpendUseCase(get()) }
    single { EditSpendUseCase(get()) }
    single { GetSpendsForDateUseCase(get()) }
    single { RemoveSpendUseCase(get()) }

    // router

}
