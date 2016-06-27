object FizzBuzz {

  def fizzbuzz(e: Int ): String =  if (e % 15 == 0) "FIZZBUZZ"
    else if (e % 3 == 0) "FIZZ"
    else if (e % 5 == 0) "BUZZ"
    else s"$e"

  def main(args: Array[String]) = {
    1 to 100 map(fizzbuzz) foreach(e => print(s"$e ")) 
    println
  }
}
