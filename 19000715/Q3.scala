object book {

	def main(args:Array[String]) {
		println("Total cost : "+cost(60));
}

	def cost( q:Double) : Double = {
		var total:Double = 0
		total = (q*24.95+q * 24.95*24/100)+(q-50)*0.75+ 50*3
		return total
}
}	