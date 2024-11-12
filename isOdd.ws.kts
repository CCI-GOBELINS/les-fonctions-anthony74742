fun displayNumber(x: Int, paire: Boolean) {
    var number = if (paire) 0 else 1
    for(i in 1..x) {
        println(number)
        number += 2
    }
}

displayNumber(5, true)


fun displayFibonacci(n: Int) {
    val fibonacci = mutableListOf(0, 1)

    if (n <= 1) {
        println(fibonacci.take(n))
        return
    }

    var a = 0
    var b = 1

    for (i in 2 until n) {
        val result = a + b
        a = b
        b = result
        fibonacci.add(result)
    }

    println(fibonacci.take(n))
}


displayFibonacci(2)
displayFibonacci(6)
displayFibonacci(10)

fun displayFactoriel(x: Int = 10) {
    var result = 1
    for (i in 1..x) {
        result *= i
    }
    println(result)
}

displayFactoriel(6)
displayFactoriel()


fun displayPremiereNumber(x: Int) {
    var number = 2
    var count = 0

    while (count < x) {
        if (isPrime(number)) {
            println(number)
            count++
        }
        number++
    }
}

fun isPrime(number: Int): Boolean {
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}


displayPremiereNumber(5)




