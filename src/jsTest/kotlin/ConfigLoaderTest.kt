import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ConfigLoaderTest: StringSpec( {
    "load config" {
        val config = ConfigLoader.loadConfig()
        config.name shouldBe "Foo"
    }
})
