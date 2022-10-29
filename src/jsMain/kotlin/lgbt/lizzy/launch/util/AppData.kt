package lgbt.lizzy.launch.util

actual class AppData actual constructor(
    actual val folderName: String
) {

    init {
        _instance = this
    }
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

    actual companion object {
        actual var _instance: AppData? = null
        actual fun getInstance(): AppData = _instance!!
    }
}