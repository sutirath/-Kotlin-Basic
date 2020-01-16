fun main(args:Array<String>){
    //Escape String
    var s1:String = "Hello \n World"
    var s2:String = "Hello \\nWorld"
    println(s1)
    println(s2)

    //Row String
    var s3:String = """Hello world \a\s\\d\s\d\sa\sad\asd\sds\"""
    var s4 = """/*UPDATE customers
SET FirstName = "supichaya"
WHERE CustomerId=61;*/

DELETE FROM customers
WHERE CustomerId = 61;"""
    println(s3)
    println(s4)
    var a = "Hello"
    var b = "World"
    println(a!==b)
    var x = 100
    var  y = 3
    println(a + " "+b+ " " +x.toString()+" "+y.toString()+ " "+(x+y).toString()  )
    println("$a $b $x $y "+(x+y))
    //------------------------
    print("input Height = ")
    val h = readLine()!!.toDouble()
    print("input Weight = ")
    val w = readLine()!!.toDouble()

    println("Sum = "+h * w)

}