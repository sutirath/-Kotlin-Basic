fun main(args:Array<String>){
    var grade = mapOf(Pair(0,"F"), Pair(1,"D"), Pair(2,"C"), Pair(3,"B"), Pair(4,"A"))
    var score = 3
    println(grade[score])
    var grade2 = mapOf(Pair("0","F"), Pair("1","D"), Pair("2","C"), Pair("3","B"), Pair("4","A"))
    println(grade2["4"])
    //---------------------------------------------------------------------------------------------

    var alphabet = mutableMapOf<Char,Int>()
    var text = "sutirath bunmueangkwa"
    for (i in text.toCharArray())
    {
        if (i in alphabet){
            alphabet.set(i,alphabet.get(i)!!.plus(1))
        }else{ alphabet.put(i,1)}
    }

    for (item in alphabet)
    {
        println(item.key + "  "+item.value)
    }
}