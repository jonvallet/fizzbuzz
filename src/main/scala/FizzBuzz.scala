object FizzBuzz {
  def main(args: Array[String]) = {
   val list = (1 to 100).map(e => if (e % 15 == 0) "FIZZBUZZ" else if (e % 3 == 0) "FIZZ" else if (e % 5 == 0) "BUZZ" else e)
   println(list.mkString(" "))
  } 
}
