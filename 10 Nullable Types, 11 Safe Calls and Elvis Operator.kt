fun main() {
    var word : String? = null ?: "SMK Telkom"
    val wordLength = word?.length

    print("Jumlah kata dari $word sebanyak $wordLength")
}