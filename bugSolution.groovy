```groovy
def calculate(a, b) {
  a = a ?: 0 // Assign 0 to a if it's null
  b = b ?: 0 // Assign 0 to b if it's null
  return a + b
}

println calculate(null, 5) // prints 5
println calculate(10, null) // prints 10
println calculate(5, 10) // prints 15
println calculate(null,null) // prints 0
```