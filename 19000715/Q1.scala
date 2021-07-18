


//def prime(n: Int): Boolean = {
  
  
 // }

 object Prime{ 
def prime(n: Int): Boolean = {
    def PrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && PrimeUntil(t-1)

    PrimeUntil(n / 2)
}

def main(args:Array[String]) {
  println(prime(13));
}
}