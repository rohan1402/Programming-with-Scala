// Greatest common divisor

def gcd (x: Int, y: Int): Int = {
	if(y != 0) {
		return gcd(y, x%y)
	}
	else {
		return x
	}
}

println(gcd(30, 45))
15