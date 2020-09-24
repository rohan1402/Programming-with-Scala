val age = 19

age match {
	case "18" : println("Wrong")
	case "19" : println("Correct")
	case "20" : println("Wrong")
	case _ : println("Default")
}
// --> Correct

// same code can also be written as
/*
val result = age match {
	case "18" : "Wrong"
	case "19" : "Correct"
	case "20" : "Wrong"
	case _ : "Default"
}
*/

// Another example
i = 7

i match {
	case 1|3|5|7|9 : print("odd")
	case 2|4|6|8|0 : print("even")
}
// --> odd