package com.spendex.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "spends")
data class DbSpend(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "amount") val amount: Float,
    @ColumnInfo(name = "currency") val currency: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "time") val time: LocalDateTime
)
