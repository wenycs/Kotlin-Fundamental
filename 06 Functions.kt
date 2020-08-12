fun setUser(name: String, hobby: String, age: Int) : String {
    return "My name is $name, I like $hobby, and I'm $age years old"
}

fun main() {
    val user = setUser("Weny", "Singing", 16)
    println(user)
}