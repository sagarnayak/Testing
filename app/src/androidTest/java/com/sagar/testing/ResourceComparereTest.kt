package com.sagar.testing

import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparereTest {

    lateinit var resourceComparere: ResourceComparere

    @Before
    fun before() {
        resourceComparere = ResourceComparere()
    }

    @Test
    fun testOne() {
        assertThat(
            resourceComparere.isEqual(
                ApplicationProvider.getApplicationContext(),
                R.string.app_name,
                "Testing"
            )
        )
            .isTrue()
    }

    @Test
    fun testTwo() {
        assertThat(
            resourceComparere.isEqual(
                ApplicationProvider.getApplicationContext(),
                R.string.app_name,
                "Testing Two"
            )
        )
            .isFalse()
    }
}