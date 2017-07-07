import org.testng.annotations.Test

/**
 * Created by Bext on 04/07/2017.
 */
/*   Factorial Example
    -- Int/Long abstraction over Java/JS
    -- All numbers are objects
    -- No "new" keyword
    -- operator overloading
    -- tail call optimization
    -- unit testing

    Data Munging Kata from book The Pragmatic Programmer, from journeyman to master Andrew Hunt, David Thomas
 */

/* Version 1.0
fun main(args: Array<String>) : Unit {

    fun factorialOld(n: Int) : Int {
        if (n <=  1) {
            return 1
        } else return factorialOld(n - 1) * n
    }

    println(factorialOld(0))
    println(factorialOld(1))
    println(factorialOld(2))
    println(factorialOld(3))
    println(factorialOld(4))
    println(factorialOld(5))
}
*/

// Version 2.0
//function at top level like main
fun factorialBis1(n: Int) : Int {
    return if (n <=  1) {
        1
    } else
        factorialBis1(n - 1) * n
}

// over if Alt + Enter -> Replace "if" with "when"
fun factorialBis(n: Int) : Int {
    return when {
        n <=  1 -> 1
        else -> factorialBis(n - 1) * n
    }
}

fun factorialBis2(n: Int) : Int {
    return if (n <=  1) 1 else factorialBis2(n - 1) * n
}


fun main(args: Array<String>) : Unit {
    println(factorialBis2(0))
    println(factorialBis2(1))
    println(factorialBis2(2))
    println(factorialBis2(3))
    println(factorialBis2(4))
    println(factorialBis2(5))
}

