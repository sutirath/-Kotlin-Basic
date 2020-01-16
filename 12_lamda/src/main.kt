fun main(args:Array<String>){
    var a = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    println(a)
    var b =Sortlist(a,10)
    println(b)
    var c = Sortlist(a){
        i -> i.sortedDescending()
        listOf(1,2,3,4,5)
    }
    println(c)

    ForEach(a){
        i,j->
        println("$i,$j")
        println(i+j)
    }
}

fun Sortlist(x:List<Int>,m:Int=0):List<Int>{
    if (m>0){
       return x.sortedDescending()
    }
    return x.sorted()

}
fun Sortlist(x:List<Int>, algolithm:(List<Int>)-> List<Int>  ):List<Int>{
    println("Function call")
    return  algolithm(x)

}
fun ForEach(x:List<Int>,job:(Int,Int)->Unit):Unit{
    for ((index,item) in  x.withIndex()){
        job(index,item)
    }
}