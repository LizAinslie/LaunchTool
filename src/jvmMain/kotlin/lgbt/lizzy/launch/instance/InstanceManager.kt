package lgbt.lizzy.launch.instance

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import lgbt.lizzy.launch.util.AppData
import java.io.File
import java.nio.charset.Charset

actual class InstanceManager actual constructor(
    actual val appData: AppData
) {
    actual fun getAllInstances(): List<MinecraftInstance> =
        File(appData.getAppData(), "instances").listFiles()?.map {
            Json.decodeFromString(it.readText(Charset.defaultCharset()))
        } ?: listOf()

    actual fun launchInstance(instance: MinecraftInstance) {
    }

    actual fun createInstance(instanceData: MinecraftInstance) {
    }
}