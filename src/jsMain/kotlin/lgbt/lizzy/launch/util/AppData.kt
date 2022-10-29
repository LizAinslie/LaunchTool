package lgbt.lizzy.launch.util

actual class AppData actual constructor(
    actual val folderName: String
) {
    actual fun getAppData(): FileDescriptor {
        TODO("Not yet implemented")
    }

    actual fun windows(): FileDescriptor {
        TODO("Not yet implemented")
    }

    actual fun linux(): FileDescriptor {
        TODO("Not yet implemented")
    }

    actual fun mac(): FileDescriptor {
        TODO("Not yet implemented")
    }
}