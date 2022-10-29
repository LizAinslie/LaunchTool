package lgbt.lizzy.launch.util

expect enum class OS {
    WINDOWS,
    MAC,
    LINUX,
    ;

    companion object {
        fun current(): OS
    }
}