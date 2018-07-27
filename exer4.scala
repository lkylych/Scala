import scala.collection.mutable.ListBuffer

object exer4 {
	def hailSeq(x: Int): List[Int] = {
		var seq = ListBuffer[Int]()
		var currentNum = x
		while (currentNum != 1) {
			seq += currentNum
			if (currentNum % 2 == 0) {
				currentNum /= 2
			}
			else {
				currentNum = 3*currentNum + 1
			}
		}
		seq += 1
		seq.toList 
	}
	
	def merge(left: List[Int], right: List[Int]): List[Int] = {
	        if (right == Nil) {
			left
		}
	        else if (left == Nil) {
			right
		}
	        else {
			val l = left.splitAt(1)
			val r = right.splitAt(1)
	        	if (l._1(0) < r._1(0)) {
				l._1(0)::merge(l._2, right)
			}
	        	else {
				r._1(0) :: merge(left, r._2)
			}
		}
    	}     

	def mergeSort(list: List[Int]): List[Int] = {
		val n = list.length / 2
		if (n == 0) {
			list
		} 
		else {
	    		val (left, right) = list.splitAt(n)
	    		merge(mergeSort(left), mergeSort(right))
	  	}
	} 

	def main(args: Array[String]) {
		var num = readLine("Hailstone Sequence: ").toInt
		println(hailSeq(num).mkString(","))
		val listForSort = List(1,4,7,3,8,23,423,2,3)
		println("Before sort: " + listForSort)
		println("After sort: " + mergeSort(listForSort))
	}
}
