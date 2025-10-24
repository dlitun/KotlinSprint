package lesson17_task3

class Folder(
    name: String,
    fileCount: Int,
    isSecret: Boolean
) {

    var name: String = name
        get() = if (isSecret) "Hidden folder" else field

    var fileCount: Int = fileCount
        get() = if (isSecret) 0 else field

    var isSecret: Boolean = isSecret
        get() = field
}

fun main() {
    val secretFolder = Folder("Work Documents", 42, true)
    val publicFolder = Folder("Photos", 120, false)

    println("Secret folder name: ${secretFolder.name}")
    println("Secret folder files: ${secretFolder.fileCount}")

    println("Public folder name: ${publicFolder.name}")
    println("Public folder files: ${publicFolder.fileCount}")
}