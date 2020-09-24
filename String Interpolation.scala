val name = "Rohan"
val age = 19

// In all the cases, the output will be "Rohan is 19 years old".

println(name + " is " + age + " years old")

println(s"$name is $age years old") // this method is not type safe

println(f"$name%s is $age%d years old") // type safe


// raw string

println(s"hello \nworld") 
// --> hello
world

println(raw"hello \nworld")
// --> hello \nworld 