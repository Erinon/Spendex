package com.spendex.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "spends")
data class DbSpend(
    @ColumnInfo(name = "id") @PrimaryKey val id: Long,
    @ColumnInfo(name = "amount") val amount: Float,
    @ColumnInfo(name = "currency") val currency: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "time") val date: String
)
