package com.sagar.testing.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sagar.testing.database.dao.ShoppingDao
import com.sagar.testing.database.entity.ShoppingItem

@Database(
    entities = [
        ShoppingItem::class
    ],
    version = 1
)
@TypeConverters(
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun shoppingDao(): ShoppingDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE
                    ?: buildDatabase(
                        context
                    )
                        .also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "dfvdfvbd.db"
            )
                .fallbackToDestructiveMigration()
                .build()
    }
}