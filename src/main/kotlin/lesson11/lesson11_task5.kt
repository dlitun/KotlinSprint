package lesson11_task5

class Forum {

    class ForumUser(
        val userId: Int,
        val userName: String
    )

    class ForumMessage(
        val authorId: Int,
        val message: String
    )

    private class UserBuilder {
        private var id: Int = -1
        private var name: String = ""

        fun id(value: Int) = apply { id = value }
        fun name(value: String) = apply { name = value }
        fun build(): ForumUser = ForumUser(id, name)
    }

    private class MessageBuilder {
        private var authorId: Int = -1
        private var text: String = ""

        fun author(id: Int) = apply { authorId = id }
        fun text(value: String) = apply { text = value }
        fun build(): ForumMessage = ForumMessage(authorId, text)
    }

    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextUserId = 1

    private val usersById get() = users.associateBy { it.userId }

    fun createNewUser(userName: String): ForumUser {
        val user = UserBuilder()
            .id(nextUserId++)
            .name(userName)
            .build()
        users += user
        return user
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        if (usersById[authorId] == null) return null
        val msg = MessageBuilder()
            .author(authorId)
            .text(message)
            .build()
        messages += msg
        return msg
    }

    fun printThread() {
        val map = usersById
        for (m in messages) {
            val author = map[m.authorId]?.userName ?: "Unknown"
            println("$author: ${m.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")

    forum.createNewMessage(user1.userId, "Hello everyone!")
    forum.createNewMessage(user1.userId, "Who is going to the meetup?")
    forum.createNewMessage(user2.userId, "Hi! I'm going.")
    forum.createNewMessage(user2.userId, "What time do we meet?")

    forum.printThread()
}
