package lgbt.lizzy.launch.util

expect class AppData {
    fun getAppData(): FileDescriptor
    fun windows(): FileDescriptor
    fun linux(): FileDescriptor
    fun mac(): FileDescriptor
}