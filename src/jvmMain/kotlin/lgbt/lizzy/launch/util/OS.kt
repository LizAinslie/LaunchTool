package lgbt.lizzy.launch.util

import java.util.*

actual enum class OS {
    WINDOWS, MAC, LINUX;

    actual companion object {
        actual fun current(): OS {
            val os = System.getProperty("os.name").lowercase(Locale.getDefault())
            return when {
                os.startsWith("Windows") -> WINDOWS
                os == "mac" -> MAC
                os == "linux" -> LINUX
                else -> throw UnsupportedOperationException("OS not supported: $os")
            }
        }
    }

}