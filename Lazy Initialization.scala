// Lazy Initialization

lazy val x = 500
// The memory will be allocated to x only if x is used code at any point of time, otherwise not.

x*2 // --> 1000
// now the memory will be allocated.
