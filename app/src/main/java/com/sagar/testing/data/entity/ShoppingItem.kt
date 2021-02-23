package com.sagar.testing.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ShoppingItem(
    @ColumnInfo var name: String = "",
    @ColumnInfo var amount: Int = 0,
    @ColumnInfo var price: Float = 0f,
    @ColumnInfo var image: String = "",
    @PrimaryKey(autoGenerate = true) var id: Int? = null
)