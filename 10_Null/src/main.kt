fun main(args:Array<String>){

    var text:String? = null
    // object?: value if null
    //object?:.method?: value if null
    //object.method.method2?.method3?: value if null
    println(text)
    println(text?.length?:"i don't have data")
    ///
    var data = listOf("hello",1234,123.00,'a',null)
    for (item in data.filterNotNull()){
        println(item)
    }
    ///


}