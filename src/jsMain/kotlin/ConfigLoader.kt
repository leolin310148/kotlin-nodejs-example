import kotlinx.coroutines.await
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlin.js.Promise

object ConfigLoader {

    val configJson = """{
        "name": "Foo"
    }"""

    fun loadConfig(): Config {
        return Json.decodeFromString(configJson)
    }

    suspend fun loadConfigAsync(): Config {
        return loadByPromise().await()
    }

    private fun loadByPromise(): Promise<Config> {
        return Promise.resolve(loadConfig())
    }
}

@Serializable
data class Config(
    var name: String = "",
)
