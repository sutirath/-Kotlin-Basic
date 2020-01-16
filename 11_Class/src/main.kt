fun main(args:Array<String>){
    var x=shape()
    var y=shape(width = 10.0,height = 20.0)
    y.print_attr()
    var z=rectangle(w = 100.0,h = 50.0)
    z.find_area()
    z.print_attr()
    var z1=square(w = 100.0)
    z1.find_area()
    z1.print_attr()
    var z2=circle(r = 3.0)
    z2.find_area()
    z2.print_attr()

    //  println(x.height)
    //  println(x.print_attr())
    var x6 = square2(3.0)
    x6.find_area()

}
//-----------------------
open class shape(var width: Double = 0.0,   var height: Double = 0.0 ) {
    var area: Double = 0.0
    fun print_attr() {
        println("With = $width, Height = $height , Area = $area")
    }
    init {
        println("Class shape Activated!")
    }
}
//--------------------
open class rectangle ( w: Double = 0.0, h: Double = 0.0 ):shape(w,h){
    open fun find_area(){
        area = width * height
    }
}
//------------------------
open class square ( w: Double = 0.0 ):rectangle(w,w)

//-----------------------
class circle (r: Double = 0.0):square(r){
    override fun find_area(){
        area = Math.PI*(width*width)
    }

}
open class square2 ( w: Double = 0.0 ):rectangle(w,w)
{
    fun print_attr(myPrint:User_Print){

    }
}
interface User_Print{
    fun myPrint(w: Double,h: Double,area:Double)
}
/*
class shape{
    var with:Double=0.0
    var height:Double=0.0
    var area:Double=0.0

        //method
        fun print_attr(){
            println("With = $with, Height = $height , Area = $area")
        }
        init{
            println("Class shape Activated!")
    }*/