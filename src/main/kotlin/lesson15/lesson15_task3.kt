package lesson15_task3

abstract class ForumUser(
    val username: String
) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class RegularUser(username: String) : ForumUser(username) {

    override fun readForum() {
        println("$username is reading the forum")
    }

    override fun writeMessage(message: String) {
        println("$username wrote a message: \"$message\"")
    }
}

class Admin(username: String) : ForumUser(username) {

    override fun readForum() {
        println("Admin $username is reading all forum sections")
    }

    override fun writeMessage(message: String) {
        println("Admin $username posted an announcement: \"$message\"")
    }

    fun deleteMessage(messageId: Int) {
        println("Admin $username deleted message with ID $messageId")
    }

    fun deleteUser(user: RegularUser) {
        println("Admin $username deleted user ${user.username}")
    }
}

fun main() {
    val user = RegularUser("John")
    val admin = Admin("Alice")

    user.readForum()
    user.writeMessage("Hello everyone!")

    println("--------------------")

    admin.readForum()
    admin.writeMessage("Please follow the forum rules.")
    admin.deleteMessage(42)
    admin.deleteUser(user)
}