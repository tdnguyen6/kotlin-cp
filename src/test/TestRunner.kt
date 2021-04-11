// TODO: change to correct problem package
import com.tidu.cp.cf._1512.a.INPUT
import com.tidu.cp.cf._1512.a.OUTPUT
import org.junit.jupiter.api.*
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import com.tidu.cp.cf._1512.a.main as run

@Suppress("MemberVisibilityCanBePrivate")
class TestRunner {
    lateinit var input: String
    lateinit var output: ByteArrayOutputStream
    lateinit var correct: String

    companion object {
        @BeforeAll
        fun setUpAll() {
        }
    }

    @BeforeEach
    fun setUpEach() {
        output = ByteArrayOutputStream()
        OUTPUT = PrintStream(output)
    }

    @AfterEach
    fun runTest() {
        INPUT = input.byteInputStream()
        run()
        Assertions.assertEquals(output.toString().trim(), correct)
    }

    @Test
    fun sample() {
        input =
            """
            4
            4
            11 13 11 11
            5
            1 4 4 4 4
            10
            3 3 3 3 10 3 3 3 3 3
            3
            20 20 10
            """.trimIndent()
        correct =
            """
            2
            1
            5
            3
            """.trimIndent()
    }
}
