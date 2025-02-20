```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    throw new NullPointerException("a and b cannot be null")
  }
  return a + b
}

println calculate(null, 5) // Throws NullPointerException
println calculate(10, null) // Throws NullPointerException
println calculate(5, 10) // prints 15
```