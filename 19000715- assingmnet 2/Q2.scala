

object printPrime {
  def primeseq(i : Int,n :Int) : Any = {
    if(n ==i)
      return 0
    else if(n % i ==0)
      return 1;
    else 
    return primeseq(i+1,n)
  }
  def main(args : Array[String]){
    var n = 13
   for( i <- 2 to n)
     if(primeseq(2,i)==0)
       println(i) 
    
  }
}