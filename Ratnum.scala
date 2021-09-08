

object ratnum{

  class rational(n:Int, d:Int){

    require(d>0) 

    def numor = n/math.abs(gcd(n,d))

    def denom = d/math.abs(gcd(n,d))

    def this(n:Int) = this(n, 1)

    def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b, a%b)

    def +(r:rational) = new rational((this.numor*r.denom) + (r.numor*this.denom), this.denom*r.denom)

    def neg = new rational(-numor, denom)

    def -(r:rational) = this + r.neg

    override def toString = numor+"/"+denom
  }

  def main(args: Array[String]): Unit = {


    var x = new rational(3,4)
    var y = new rational(5,8)
    var z = new rational(2,7)

    var sub = x-y-z

    println("negative of y = " + y.neg)
    println("substrction of x, y, z = " + sub)



  }



}
