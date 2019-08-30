package com.spendex.data.database.dao

import androidx.room.*
import com.spendex.data.database.model.DbSpend
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface SpendDao {

    @Query("SELECT * FROM spends")
    fun findAll(): Single<List<DbSpend>>

    @Insert
    fun insert(spend: DbSpend): Completable

    @Update
    fun update(spend: DbSpend): Completable

    @Delete
    fun delete(spend: DbSpend): Completable
}
