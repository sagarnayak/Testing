package com.sagar.testing.data.dao

import androidx.room.*
import com.sagar.testing.data.entity.ShoppingItem
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