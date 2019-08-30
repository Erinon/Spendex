package com.spendex.data.repository

import com.spendex.data.database.dao.SpendDao
import com.spendex.data.database.mapper.DbSpendMapper
import com.spendex.domain.model.Spend
import com.spendex.domain.repository.SpendRepository
import io.reactivex.rxjava3.core.Single
import java.util.*

class SpendRepositoryImpl(
    private val spendDao: SpendDao,
    private val dbSpendMapper: DbSpendMapper
) : SpendRepository {

    override fun getSpendsForDate(date: Date): Single<List<Spend>> =
        spendDao.findAll().map(dbSpendMapper::dbSpendListToSpendList)

    override fun addSpend(spend: Spend) = spendDao.insert(dbSpendMapper.spendToDbSpend(spend))

    override fun editSpend(spend: Spend) = spendDao.update(dbSpendMapper.spendToDbSpend(spend))

    override fun removeSpend(spend: Spend) = spendDao.delete(dbSpendMapper.spendToDbSpend(spend))
}
