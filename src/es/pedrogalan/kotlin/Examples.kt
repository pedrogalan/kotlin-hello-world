package es.pedrogalan.kotlin

fun main(args: Array<String>) {
    val message = args[0]
    message.greeting().println()
}

private fun String.greeting(): String {
    return "Hello $this"
}

private fun String.println() = println(this)