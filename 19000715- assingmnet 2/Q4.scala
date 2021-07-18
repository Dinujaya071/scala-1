

object evenodd {
  def number(n : Int): Int = {
    
    if(n == 0 ) return 0
    else if(n==1) return 1
    
    else if(n % 2 == 0  ) return 0
    else if(n % 2 ==1)  number(n-2);
    else return 0
    
    
      
  }
  def main(args :Array[String] ){
    var x = 1;
    number(x)
    if(number(x) == 1)
      println("Number is odd");
    if(number(x)== 0)
      println("Number is even");
      
  }
}