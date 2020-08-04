val wordOne = "Modern"
val wordTwo = "Concise"
val wordThree = "Pragmatic"
val wordFour = "Safe"

fun main() {
    val line = """
        Kotlin is $wordOne
        Kotlin is $wordTwo
        Kotlin is $wordThree
        Kotlin is $wordFour
    """.trimIndent()

    print(line)
}