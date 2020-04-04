package es.pedrogalan.kotlin

fun main(args: Array<String>) {
    val message = args[0]
    println(message.greeting())
}

private fun String.greeting(): String {
    return "Hello $this"
}
