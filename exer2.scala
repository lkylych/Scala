import scala.collection.mutable.ListBuffer

object exer2{
	def divisors(x: Int): List[Int] = {
		var divisorsList = ListBuffer[Int]()
		for (n <- 2 to x/2) {
			if (x % n == 0) {
				divisorsList += n
			}
		}
		divisorsList.toList
		
	}
	
	def primes(x: Int): Boolean = {
		var isPrime = true
		for (n <- 2 to x/2) {
			if (x % n == 0) {
				isPrime = false
			}
		}
		isPrime
	}

	def join(separator: String, list: List[String]): String = {	
		var joinedStr = ""
		for (str <- list) {
			joinedStr += str
			joinedStr += separator
		}
		joinedStr.slice(0, joinedStr.length - separator.length)
	}
	
	def pythagorean(max: Int): List[(Int, Int, Int)] = {
		var pythagoreanList = ListBuffer[(Int, Int, Int)]()
		for (a <- 1 to max; b <- 1 to a; c <- 1 to max) {
			if (a*a + b*b == c*c) {
				pythagoreanList += new Tuple3(a, b, c)
			}
		}
		pythagoreanList.toList
	}	
	
	def main(args: Array[String]) {
		var num = readLine("Find divisors for number: ").toInt
		println(divisors(num).mkString(","))
		var isPrime = readLine("Check if number is prime: ").toInt
		println(primes(isPrime))
		var separator = readLine("Enter any separator: ")
		println(join(separator, List("1","2","3")))
		var pythagoreanMax = readLine("Enter max value for c: ").toInt
		println(pythagorean(pythagoreanMax).mkString(","))
	}
}
