import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.await
import kotlinx.coroutines.launch
import kotlin.js.Promise

fun main() {
    val config = ConfigLoader.loadConfig()
    println("config: ${config.name}")

    GlobalScope.launch {
        val asyncConfig = ConfigLoader.loadConfigAsync()
        println("config: ${asyncConfig.name}")
    }

    println("stop")
}
