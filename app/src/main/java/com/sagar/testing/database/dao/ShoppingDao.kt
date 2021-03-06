package com.sagar.testing.database.dao

import androidx.room.*
import com.sagar.testing.database.entity.ShoppingItem
import io.reactivex.Completable
import io.reactivex.Observable

@Dao
interface ShoppingDao {
    @Query("SELECT * FROM ShoppingItem")
    fun getAll(): Observable<List<ShoppingItem>>

    @Insert
    fun add(shoppingItem: ShoppingItem): Completable

    @Delete
    fun delete(shoppingItem: ShoppingItem): Completable

    @Update
    fun update(shoppingItem: ShoppingItem): Completable
}