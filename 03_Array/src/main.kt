fun main(args:Array<String>){
    var  a = arrayOf(1,2,3,4,5,6,7,8,9)
    println(a[4])
    println(a.get(0))
    var b = Array<Int>(8,init = {index -> index+1})
    var c= Array<String>(10,init = {index -> "Hello World ${index+1}"})
    var d= arrayOfNulls<String>(5)
    d.set(0,"John")
    d.set(1,"peter")
    d.set(2,"bas")
    d.set(3,"Young")
    d.set(4,"Ohm")
    d.sort()
   for ((i,item) in d.withIndex()) {
       println("index: $i data : $item")
   }


    var temp= readLine()
    var param=temp!!.split(" ")
    var area=0.5 * param[0].toDouble() * param[1].toDouble()
    println("%.4f".format(area))
}