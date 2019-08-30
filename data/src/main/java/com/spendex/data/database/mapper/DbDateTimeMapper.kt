package com.spendex.data.database.mapper

import java.util.*

interface DbDateTimeMapper {

    fun stringToDateTime(date: String): Date

    fun dateTimeToString(date: Date): String
}
