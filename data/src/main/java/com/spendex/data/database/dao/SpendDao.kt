package com.spendex.data.database.dao

import androidx.room.*
import com.spendex.data.database.model.DbSpend
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

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
