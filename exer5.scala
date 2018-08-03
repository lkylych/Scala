import scala.collection.mutable.ListBuffer

object exer5 {
	def fib(x: Int): Int = {
		var fib0 = 0
		var fib1 = 1
		var fib = 0
		for (n <- 2 to x) {
			fib = fib0+fib1
			fib0 = fib1
			fib1 = fib
		}
		fib
	}
	
	def main(args: Array[String]) {
		var num = readLine("Fibonacci: ").toInt
		println(fib(num))
	}
}
