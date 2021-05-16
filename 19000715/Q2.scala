object  vol{

def main(args:Array[String]) {
println("Volume of the sphere : "+volume(5));
}

def volume( r:Double) : Double = {
var v:Double = 0
v = (4/3)*3.14*r*r*r
return v
}
}	