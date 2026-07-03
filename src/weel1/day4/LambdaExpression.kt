//with type annotation
val sum1 = {a:Int, b: Int -> a+b}

//without type annotation
val sum2 : (Int,Int) -> Int = {a,b -> a+b}

fun main(args:Array<String>){
    val result1 = sum1(5,7)
    val result2 = sum2(8,5)
    println("The sum of two numbers is: $result1")
    println("The sum of two numbers is: $result2")

    println(sum1(2,3))
}
