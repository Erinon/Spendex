package com.spendex.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.spendex.data.database.dao.SpendDao
import com.spendex.data.database.model.DbSpend

@Database(entities = [DbSpend::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun spendDao(): SpendDao
}
