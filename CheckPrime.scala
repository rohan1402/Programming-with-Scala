//Prime or not

def check_prime(n: Int): Boolean = {
	if (n <= 1) return false;
	for(i <- 2 to n/2) {
		if (n % i == 0) return false
	}
	return true;
}

print(check_prime(15))
// --> false

print(check_prime(17))
// --> true