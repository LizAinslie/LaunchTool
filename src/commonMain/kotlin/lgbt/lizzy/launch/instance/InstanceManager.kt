package lgbt.lizzy.launch.instance

expect object InstanceManager {
    fun getAllInstances(): List<MinecraftInstance>
    fun launchInstance(instance: MinecraftInstance)
    fun createInstance(instanceData: MinecraftInstance)
}