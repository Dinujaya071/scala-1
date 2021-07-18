

object Fibonacci {
  def func(n :Int) :Int={
    if (n == 0) return 0
    if (n == 1) return 1
   else
   return func(n-1) + func(n-2)
  }
   def main(args : Array[String]) {
     println(func(6));
   }
}