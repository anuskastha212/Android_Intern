var lambda ={a:Int, b: Int -> a+b}

fun higherfun (lmbd:(Int, Int) -> Int){
    var result = lmbd(2,4)
    println("The sum of two numbers is $result")
}

fun main (args:Array<String>){
    higherfun(lambda)
}