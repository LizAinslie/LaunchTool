package lgbt.lizzy.launch.util

import java.io.File

actual class AppData actual constructor(
    actual val folderName: String
) {
    init {
        _instance = this
    }

    actual fun getAppData(): FileDescriptor = when (OS.current()) {
        OS.WINDOWS -> windows()
        OS.MAC -> mac()
        OS.LINUX -> linux()
    }

    actual fun windows(): FileDescriptor {
        val appDataFolder = File(System.getenv("UserProfile"), "AppData${File.pathSeparator}$folderName")
        if (!appDataFolder.exists())
            appDataFolder.mkdirs()
        return appDataFolder
    }

    actual fun linux(): FileDescriptor {
        val appDataFolder = File(System.getenv("HOME"), ".config${File.pathSeparator}$folderName")
        if (!appDataFolder.exists())
            appDataFolder.mkdirs()
        return appDataFolder
    }

    actual fun mac(): FileDescriptor {
        val appDataFolder = File(System.getenv("HOME"), "Library${File.pathSeparator}Application Support${File.pathSeparator}$folderName")
        if (!appDataFolder.exists())
            appDataFolder.mkdirs()
        return appDataFolder
    }

    actual companion object {
        actual var _instance: AppData? = null
        actual fun getInstance(): AppData = _instance!!
    }
}