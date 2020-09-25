// ways to create functions

def add(x: Int, y: Int): Int = {
	return x + y;
}

def substract(x: Int, y: Int): Int = {
	x - y;				     // return keyword can be avoided
}

def multiply(x: Int, y: Int): Int = x * y;  // curly braces can be avoided

def divide(x: Int, y: Int) = x / y;  	    // can avoid return type, when it is certain about the return type i.e. int / int = int

// calling of functions

print(add(2,3)) 
//--> 5
print(substract(5,3))
//--> 2
print(multiply(3,2))
//--> 6
print(divide(4,2))
//--> 2


