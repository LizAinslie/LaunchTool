package lgbt.lizzy.launch.instance

import lgbt.lizzy.launch.util.AppData

actual class InstanceManager actual constructor(
    actual val appData: AppData
) {
    actual fun getAllInstances(): List<MinecraftInstance> {
        TODO("Not yet implemented")
    }

    actual fun launchInstance(instance: MinecraftInstance) {
    }

    actual fun createInstance(instanceData: MinecraftInstance) {
    }
}