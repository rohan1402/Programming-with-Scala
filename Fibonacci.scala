// Fibonacci

def fibonacci(num: Int): Int = {
	if(num <= 1) return num;
	return fibonacci(num-1) + fibonacci(num-2);
}

for(i <- 1 to 10) {
	print(fibonacci(i) + "\t");
}

//--> 1	1 2 3 5 8 13 21 34 55