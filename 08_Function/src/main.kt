fun main(args:Array<String>){
    var  x = add(2, 3)
    println(x)
    println(add(10,20))

    println(mux(5,10))
    println(sub(10,7))
    printme("Hellowaorl")

}

fun add(a:Int,b:Int):Int{
    println("a = $a  b = $b")
    return a+b
}
fun mux(a:Int,b:Int = 1):Int{
    println("a = $a  b = $b")
    return a*b
}

fun sub(a:Int,b:Int):Int = a-b
fun printme(s:String):Unit = println("Message : $s")