package lgbt.lizzy.launch.util

expect class AppData(
    folderName: String
) {
    fun getAppData(): FileDescriptor
    fun windows(): FileDescriptor
    fun linux(): FileDescriptor
    fun mac(): FileDescriptor

    companion object {
        val instance: AppData
    }

    val folderName: String
}