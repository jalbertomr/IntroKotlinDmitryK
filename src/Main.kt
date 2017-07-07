/**
 * Created by Bext on 04/07/2017.
 */
// From An introduction to Kotlin by example by Dmitry Kandalov youtube

package com.bext.gio

data class Money(val amount: Int, val currency: String)

fun main(args : Array<String>) {
    val message = "World!"   //over val can remake variable immutable
    //message = "cambiado"   //no puede ser camviado es immutable
    // over variable can make mutable
    println("Hello $message " + args[0] + args[1])

    println(greetings(message) + args[0] + args[1])
    // select "Hello $message "
    // Ctrl + Alt + M to extract to function

    println(message.greetingsBis2())   // from function parameter to receiver

    message.greetingsBis2().println(); // using redefined println

    greetingsBis3(message = "valorDefaultSobreescrito").println()
    greetingsBis3("valorDefaultSobreescrito").println()

    // integrates from Java
    HelloFunction.greetingsFromJava().println()
}

private fun greetingsBis(message: String) = "Hello $message "     //This is an EXPRESSION format
                                    // alt + Enter over = "Hello ... to convert to block body

private fun greetings(message: String): String {       //This is an Block body format of the function
    return "Hello $message "                           // paramenter is final, cannot prepend val
}

// over parameter, alt + Enter -> Convert parameter to receiver

fun String.greetingsBis2(): String {
    return "Hello ${this} "
}

fun String.println() = println(this)   //redefining println

// defining default values in params
private fun greetingsBis3(message : String = "valorDefault"): String {
    return "Hello ${message} "
}

/*
   -- Basic Syntax
   -- String Abstration over Java/JS
   -- VAL vs VAR
   -- Named Parameters
   -- Extension Function
   -- Integration with Java
 */