package com.sagar.testing.database.dao

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.sagar.testing.database.AppDatabase
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class ShoppingDaoTest {

    lateinit var appDatabase: AppDatabase
    lateinit var shoppingDao: ShoppingDao

    @Before
    fun init() {
        appDatabase = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java
        )
            .allowMainThreadQueries()
            .build()
        shoppingDao = appDatabase.shoppingDao()
    }

    @After
    fun tearDown() {
        appDatabase.close()
    }

    @Test
    fun insertTest(){

    }
}