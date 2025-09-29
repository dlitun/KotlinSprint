package lesson11_task3

enum class VoiceStatus(val label: String) {
    TALKING("talking"),
    MIC_OFF("mic off"),
    MUTED("muted")
}

data class Participant(
    val id: Int,
    val username: String,
    val avatarUrl: String,
    var status: VoiceStatus
)

class Room(
    val id: Int,
    val title: String,
    val coverUrl: String
) {
    private val participants = mutableListOf<Participant>()

    fun getParticipants(): List<Participant> = participants.toList()

    fun addParticipant(p: Participant) {
        if (participants.any { it.id == p.id }) {
            println("Participant '${p.username}' is already in the room.")
        } else {
            participants.add(p)
            println("Participant '${p.username}' has joined the room '$title'.")
        }
    }

    fun updateStatus(username: String, newStatus: VoiceStatus) {
        val user = participants.firstOrNull { it.username == username }
        if (user != null) {
            user.status = newStatus
            println("Status of '${user.username}' updated to '${newStatus.label}'.")
        } else {
            println("No participant found with username '$username'.")
        }
    }

    fun printRoomInfo() {
        println("\n=== Room Info ===")
        println("Title: $title")
        println("Cover: $coverUrl")
        println("Participants:")
        if (participants.isEmpty()) {
            println("  (no participants yet)")
        } else {
            participants.forEach {
                println("  - ${it.username} [${it.status.label}]")
            }
        }
        println("=================\n")
    }
}

fun main() {
    val room = Room(1, "Kotlin Talks", "cover.png")
    val alice = Participant(1, "Alice", "alice.png", VoiceStatus.MIC_OFF)
    val bob = Participant(2, "Bob", "bob.png", VoiceStatus.TALKING)
    val charlie = Participant(3, "Charlie", "charlie.png", VoiceStatus.MUTED)

    room.addParticipant(alice)
    room.addParticipant(bob)
    room.addParticipant(charlie)
    room.printRoomInfo()
    room.updateStatus("Alice", VoiceStatus.TALKING)
    room.updateStatus("Dave", VoiceStatus.MIC_OFF)
    room.printRoomInfo()
}