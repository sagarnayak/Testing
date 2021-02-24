package com.sagar.testing.database.dao

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import com.sagar.testing.LiveDataTestUtil
import com.sagar.testing.database.AppDatabase
import com.sagar.testing.database.entity.ShoppingItem
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ShoppingDaoTest {

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var appDatabase: AppDatabase
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
    fun insertTest() {
        shoppingDao.add(
            ShoppingItem(
                name = "Apple",
                amount = 12,
                price = 34f
            )
        )
            .blockingGet()

        val items = shoppingDao.getAll().blockingFirst()

        assertThat(items).isNotNull()
    }
}