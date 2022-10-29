package lgbt.lizzy.launch.instance

import lgbt.lizzy.launch.util.AppData

expect class InstanceManager(appData: AppData) {
    val appData: AppData

    fun getAllInstances(): List<MinecraftInstance>
    fun launchInstance(instance: MinecraftInstance)
    fun createInstance(instanceData: MinecraftInstance)
}