package com.sagar.testing

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testOne() {
        val toTest = 45
        assertThat(toTest).isEqualTo(45)
    }
}