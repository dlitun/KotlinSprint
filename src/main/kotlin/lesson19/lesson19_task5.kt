package lesson19_task5

enum class Gender {
    MALE,
    FEMALE
}

class Person(val name: String, val gender: Gender)

fun main() {
    println("Enter name and gender separated by space.")
    println("Available genders: MALE or FEMALE")
    println("Example: John MALE")

    val people = mutableListOf<Person>()

    while (people.size < 5) {
        print("Enter data for person ${people.size + 1}: ")
        val input = readln().trim().split(" ")

        if (input.size != 2) {
            println("Invalid format. Please enter: Name Gender")
            continue
        }

        val name = input[0]
        val genderInput = input[1].uppercase()

        val gender = try {
            Gender.valueOf(genderInput)
        } catch (e: IllegalArgumentException) {
            println("Invalid gender. Please use MALE or FEMALE.")
            continue
        }

        people.add(Person(name, gender))
    }

    println("\nList of people:")
    for (person in people) {
        println("Name: ${person.name}, Gender: ${person.gender}")
    }
}