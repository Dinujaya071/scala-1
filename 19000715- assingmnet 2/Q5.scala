

object Sumeven {
  def sum(n: Int): Int ={
  if (n <= 1)
          return 0;
    else
      
    if(n%2 == 1)
        return sum(n - 1);
     else
     return n + sum(n - 1);
      

}
  
def main(args :Array[String]) {
    println(sum(10))
  }
}
