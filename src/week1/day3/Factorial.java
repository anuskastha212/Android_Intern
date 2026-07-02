fun main(){
    print("Enter a number:")
    val num = readLine()!!.toInt()

    var i = 1
    var fact = 1

    if (num < 0) {
        println("Please enter a positive number.")
    } else {
        while (i<=num){
            fact *= i++
        }
        println("Factorial of $num = $fact")
    }
}