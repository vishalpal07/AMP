fun main(args: Array<String>)
{
    println("Enter Byte ")
    val b: Byte = args[0].toByte()
    println(b)
    println("Enter Short ")
    val s: Short = args[1].toShort()
    println(s)
    println("Enter Int ")
    val i: Int = args[2].toInt()
    println(i)
    println("Enter Long ")
    val l: Long = args[3].toLong()
    println(l)
    println("Enter Float ")
    val f: Float = args[4].toFloat()
    println(f)
    println("Enter Double ")
    val d: Double = args[5].toDouble()
    println(d)
//     val c: Char = args[8].toChar()
//     println(c)
    print("Enter String ")
    val st: String = args[6].toString()
    println(st)
    print("Enter Boolean ")
    val bo: Boolean = args[7].toBoolean()
    println(bo)
}


/*

D:\Kotlin-Test\4-Dec-2024>kotlinc DataTypes.kt

D:\Kotlin-Test\4-Dec-2024>kotlin DataTypesKt 10 11 12 13 14 15 hello true
Enter Byte
10
Enter Short
11
Enter Int
12
Enter Long
13
Enter Float
14.0
Enter Double
15.0
Enter String hello
Enter Boolean true

*/