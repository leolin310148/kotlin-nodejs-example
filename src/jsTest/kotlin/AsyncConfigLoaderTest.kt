import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AsyncConfigLoaderTest : FunSpec() {
    init {
        test("load config").config(coroutineTestScope = true) {
            val config = ConfigLoader.loadConfigAsync()
            config.name shouldBe "Foo"
        }
    }
}
