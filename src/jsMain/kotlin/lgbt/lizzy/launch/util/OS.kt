package lgbt.lizzy.launch.util

actual enum class OS {
    WINDOWS, MAC, LINUX;

    actual companion object {
        actual fun current(): OS {
            TODO("Not yet implemented")
        }
    }
}