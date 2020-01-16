// LIST
fun main(args:Array<String>){
    var items= listOf("hello","world",123,123.456,"hello") //ข้อมูลซ้ำกันได้ เก็บได้หลายชนิด ไม่สามารถเปลี่ยนแปลงได้
    println(items[1])
    for(i in items)
    {
        println(i.toString() + ":" + i::class.simpleName.toString())
    }
    var items2= mutableListOf("hello","world",123,123.456,"hello")
    items2.add(1,"sutirath")
    for (i in items2)
    {
        println(i.toString() + ":" + i::class.simpleName.toString())
    }

}