

class Ratnum( n:Int , a:Int ) {

    require(a>0 , "a cannot be negative")

    private def gcd( x:Int , y:Int ):Int = {
        if ( y == 0 ) x
        else if ( y > x ) gcd( y , x )
        else gcd( y, x%y )
    }


    private val b = gcd( Math.abs(n) , a )

    val numer = n/b

    val deno = a/b

    def this( n : Int ) = this( n , 1 )

    def +( that : Rational ) :Rational = new Rational( this.num * that.denom + that.num * this.denom  , this.denom * that.denom )

    def neg : Rational = new Rational( -this.num , this.denom )

    def -( that : Rational ) : Rational = this + that.neg

    def *( that : Rational ) : Rational = new Rational( this.num * that.num , this.denom * that.denom )

    def /( that : Rational ) : Rational = new Rational( this.num * that.denom , this.denom * that.num )

    @Override
    override def toString() : String = {

        deno match {

            case n if n==1 => num.toString

            case _ => num + "/" + denom

        }

    }
}
