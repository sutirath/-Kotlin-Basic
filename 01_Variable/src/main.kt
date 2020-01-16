fun main(args:Array<String>){
    // immutable ห้ามเปลี่ยนค่า
    val pi:Double = 3.1415926
    val pi2 = 2.3568974
    println(pi)
    println(pi2)

    // mutable เปลี่ยนค่าได้
    var bmi = 3.1459
    bmi = 2.156
    bmi = 5.63
    println(bmi)
    println(bmi::class.simpleName + bmi.toString())

}
