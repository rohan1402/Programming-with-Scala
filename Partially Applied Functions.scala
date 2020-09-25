// Partially Applied Functions

val sum = (a: Int, b: Int, c: Int) = a + b + c

val f1 = sum(10, _ : Int, _ : Int)
println(f1(20, 30))
// --> 60

val f2 = sum(10, 20, _ : Int) 
println(f2(30))
//--> 60




def log(date: Date, message: String) = {
	println(date + " " + message)
}

val date = new Date;
val newlog = log(date, _ : String)
newlog("Message 1")
// --> Mon Dec 04 22:44:15 "Message 1"

newlog("Message 2")
// --> Mon Dec 04 22:44:15 "Message 2"