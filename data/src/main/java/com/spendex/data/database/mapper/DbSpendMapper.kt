package com.spendex.data.database.mapper

import com.spendex.data.database.model.DbSpend
import com.spendex.domain.model.Spend

interface DbSpendMapper {

    fun dbSpendToSpend(dbSpend: DbSpend): Spend

    fun dbSpendListToSpendList(dbSpendList: List<DbSpend>): List<Spend>

    fun spendToDbSpend(spend: Spend): DbSpend
}
