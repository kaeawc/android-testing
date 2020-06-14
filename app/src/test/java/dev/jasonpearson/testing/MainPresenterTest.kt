package dev.jasonpearson.testing

import org.junit.Assert.*
import org.junit.Test

class MainPresenterTest {

    @Test
    fun greetJason() {
        val result = MainPresenter().greet("Jason")
        assertEquals(result, "Hello Jason!")
    }
}
