
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

import org.junit.Test
import java.math.BigDecimal
import java.math.BigDecimal.ONE


/**
 * Created by Bext on 04/07/2017.
 */
//  JUnit Tests

class FactorialTests{
    @Test fun `calculate factorial`(){
        assertThat(factorialOld(0), equalTo(1))
        assertThat(factorialOld(1), equalTo(1))
        assertThat(factorialOld(2), equalTo(2))
        assertThat(factorialOld(3), equalTo(6))
        assertThat(factorialOld(4), equalTo(24))
        assertThat(factorialOld(5), equalTo(120))
//        assertThat(factorialOld(17), equalTo(120))
    }

    @Test fun `calculate factorialBigI`(){
        assertThat(factorial(BigDecimal(0)), equalTo(ONE))
        assertThat(factorial(BigDecimal(1)), equalTo(ONE))
        assertThat(factorial(BigDecimal(2)), equalTo(BigDecimal(2)))
        assertThat(factorial(BigDecimal(3)), equalTo(BigDecimal(6)))
        assertThat(factorial(BigDecimal(4)), equalTo(BigDecimal(24)))
        assertThat(factorial(BigDecimal(5)), equalTo(BigDecimal(120)))
        assertThat(factorial(BigDecimal(17)), equalTo(BigDecimal(355687428096000)))
        println(factorial(BigDecimal(30000)))
    }
}

fun factorialOld(n: Int) : Int {
    return if (n <=  1) 1 else factorialOld(n - 1) * n
}

fun factorialOld2(n: BigDecimal) : BigDecimal {
    return if (n <= 1) ONE else factorial(n - 1) * n
}

tailrec fun factorial(n: BigDecimal, result: BigDecimal = ONE) : BigDecimal {
    return if (n <= 1) result else factorial(n - 1, result * n)
}

operator fun BigDecimal.minus(n :Int) =  this.minus(BigDecimal(n))
operator fun BigDecimal.compareTo(n: Int) = this.compareTo(BigDecimal(n))