//Higher order functions

def math(x: Double, y: Double, f:(Double, Double) => Double): Double = f(x,y)

math(50, 20, (x, y) => x + y)
//--> 70.0

math(50, 20, (x, y) => x - y)
//--> 30.0

math(50, 20, (x, y) => x min y)
//--> 20.0

math(50, 20, (x, y) => x max y)
//--> 50.0



def math1(x: Double, y: Double, z: Double, f:(Double, Double) => Double): Double = f((x,y),z)

math1(50, 20, 10, (x,y) => x min y)
//--> 10

math1(50, 20, 10, _ + _)
// --> 80