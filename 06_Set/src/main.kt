fun main (args:Array<String>){
    var letter = setOf("a","b","c","d","e","f","a","b","c")
    println(letter)

    var text = "gmfdijruthunbrugvcvrgjdfreffsdvcfdv"
    var alphabet = text.toSet()

    println(alphabet)
    var gram = mutableMapOf<Char,Int>()
    for (c in text.toCharArray()){
        gram.set(c,(gram?.get(c)?:0)+1)
    }
    println(gram)
}