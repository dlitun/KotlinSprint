package lesson14_task4

open class Message(
    val id: Int,
    val author: String,
    val text: String
) {
    open fun print() {
        println("$author: $text (id: $id)")
    }
}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int
) : Message(id, author, text) {
    override fun print() {
        println("\t$author: $text (id: $id, reply to: $parentMessageId)")
    }
}

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String): Int {
        val id = nextId++
        messages += Message(id, author, text)
        return id
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int): Int {

        val parent = messages.find { it.id == parentMessageId }
            ?: error("Parent message not found: $parentMessageId")
        require(parent !is ChildMessage) { "Threading to a child message is not allowed" }

        val id = nextId++
        messages += ChildMessage(id, author, text, parentMessageId)
        return id
    }

    fun printChat() {

        val groups = messages.groupBy { msg ->
            if (msg is ChildMessage) msg.parentMessageId else msg.id
        }

        messages.forEach { parent ->
            if (parent is ChildMessage) return@forEach
            parent.print()
            groups[parent.id]
                ?.filterIsInstance<ChildMessage>()
                ?.sortedBy { it.id }
                ?.forEach { it.print() }
        }
    }
}

fun main() {
    val chat = Chat()

    val id1 = chat.addMessage("Hello everyone!", "Alice")
    val id2 = chat.addMessage("What's up?", "Bob")

    chat.addThreadMessage("Hi Alice!", "Charlie", id1)
    chat.addThreadMessage("Nice to see you", "David", id1)
    chat.addThreadMessage("Not much, just coding", "Alice", id2)

    val id3 = chat.addMessage("Anyone free this weekend?", "David")
    chat.addThreadMessage("I am!", "Bob", id3)
    chat.addThreadMessage("Me too", "Charlie", id3)

    chat.printChat()
}