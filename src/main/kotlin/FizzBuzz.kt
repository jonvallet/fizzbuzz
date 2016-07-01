fun fizzbuzz(i: Int):String {
	if (i % 15 == 0)
		return "FizzBuzz"
	else if (i % 3 == 0)
		return "Fizz"
	else if (i % 5 == 0)
		return "Buzz"
	else
		return i.toString()
}

fun main (args: Array<String>) {
        (1..100).map {fizzbuzz(it)}.forEach {print("$it ")}
	println()
}

