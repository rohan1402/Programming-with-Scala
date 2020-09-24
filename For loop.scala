//Ways to print numbers from 1 to 5 using for loop

// to() method
for(i <- 1 to 5) // can also be written as (i <- 1.to(5))
println(i) 

//until() method
for(i <- 1 until 6) // can also be written as (i <- 1.until(6))
println(i) 

//List range
val list = List(1, 2, 3, 4, 5)
for(i <- list)
println(i)

//Multiple range
for(i <- 1 to 2; j <- 1 to 3)
println(i + " " + j)
/* -->
1 1
1 2 
1 3
2 1
2 2
2 3
*/

//Filtering
for(i <- list; if (i%2 == 0))
println(i)
/* -->
2
4
*/

// As an expression
val result = for{ i <- list; if (i%2 == 0) } yield { i*i}
println(result)
/* --> 
4 
16
*/