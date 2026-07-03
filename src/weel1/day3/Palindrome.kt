fun main() {

    print("Enter a string: ")
    val str = readLine()!!

    var isPalindrome = true

    for (i in 0 until str.length / 2) {

        if (str[i] != str[str.length - 1 - i]) {
            isPalindrome = false
            break
        }
    }

    if (isPalindrome) {
        println("Palindrome")
    } else {
        println("Not a Palindrome")
    }
}