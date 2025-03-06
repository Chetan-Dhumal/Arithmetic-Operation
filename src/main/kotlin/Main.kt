fun add(a: Int, b: Int): Int {
    return a + b
}
fun subtract(a: Int, b: Int): Int {
    return a - b
}
fun multiply(a: Int, b: Int): Int {
    return a * b
}
fun divide(a: Int, b: Int): Double {
    return if (b != 0) a.toDouble() / b else throw ArithmeticException("Cannot divide by zero")
}
fun main() {
    val num1 = 10
    val num2 = 5
    println("Addition: ${add(num1, num2)}")
    println("Subtraction: ${subtract(num1, num2)}")
    println("Multiplication: ${multiply(num1, num2)}")
    println("Division: ${divide(num1, num2)}")
}