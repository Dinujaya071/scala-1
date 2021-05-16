object far {

def main(args:Array[String]) {
println("Farenhiete temperature : "+con(35));
}

def con( c:Double) : Double = {
var f:Double = 0
f = c * 1.8000 + 32.00
return f
}
}	