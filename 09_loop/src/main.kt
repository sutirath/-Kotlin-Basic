fun main(args:Array<String>){
    var data = listOf("hello","world","abcd","csmju")
    for ((i,item) in data.withIndex()){

        println("data at $i is $item")
    }
    //for range
    for (i in 0..9){
        println("range is $i")
    }
    //นับทีละ2
    for (i in 0..20 step 2){
        println("step is  $i")
    }
    //นับถอยหลัง
    for (i in 10 downTo 0){
        println("      downto $i")
    }
    //repeat ทำซ้ำๆ
    repeat(10){
     j-> print("x$j")
    }
    println()
    //ข้ามเลข
    for (i in 0..10){
        if (i==5)
            continue
            print("$i")

    }
    println()
    //
loop1@    for (r in 1..5){
loop2@        for (c in 1..6){
            if (r==3)
                continue@loop1
           print("($r,$c)")
        }
        println()
    }
}