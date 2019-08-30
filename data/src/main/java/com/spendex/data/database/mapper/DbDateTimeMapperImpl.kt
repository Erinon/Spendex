package com.spendex.data.database.mapper

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

private const val DATE_TIME_FORMAT = "yyyy-MM-ddTHH:mm:ss"

object DbDateTimeMapperImpl : DbDateTimeMapper {

    @SuppressLint("SimpleDateFormat")
    override fun stringToDateTime(date: String) = SimpleDateFormat(DATE_TIME_FORMAT).parse(date)!!

    @SuppressLint("SimpleDateFormat")
    override fun dateTimeToString(date: Date): String =
        SimpleDateFormat(DATE_TIME_FORMAT).format(date)
}
