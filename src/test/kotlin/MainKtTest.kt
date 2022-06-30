import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @BeforeEach
    fun setUp() {
        val usr = User("zilgo",
            "stardust",
            24,
            "adm",
            "my name is yoshikage kira..."
        )
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun main() {
    }
}