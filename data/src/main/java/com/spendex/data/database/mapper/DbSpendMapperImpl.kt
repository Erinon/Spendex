package com.spendex.data.database.mapper

import com.spendex.data.database.model.DbSpend
import com.spendex.domain.model.Currency
import com.spendex.domain.model.Spend

class DbSpendMapperImpl : DbSpendMapper {

    override fun dbSpendToSpend(dbSpend: DbSpend) =
        with(dbSpend) {
            Spend(
                id,
                amount,
                Currency.valueOf(currency),
                description,
                time
            )
        }

    override fun dbSpendListToSpendList(dbSpendList: List<DbSpend>) =
        dbSpendList.map { dbSpendToSpend(it) }

    override fun spendToDbSpend(spend: Spend) =
        with(spend) {
            DbSpend(
                id,
                amount,
                currency.toString(),
                description,
                time
            )
        }
}
