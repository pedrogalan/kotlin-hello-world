package es.pedrogalan.kotlin

fun main(args: Array<String>) {
    val message = args[0]
    println(greetings(message))
}

private fun greetings(message: String): String {
    return "Hello $message"
}
