fun main(args: Array<String>)
{
    val b: Int = args[0].toInt()
    if(b>0)
    {
        println("Natural number")
    }
    else
    {
        println("Non Natural number")
    }
}


/*


D:\Kotlin-Test\4-Dec-2024>kotlinc NaturalNumber.kt

D:\Kotlin-Test\4-Dec-2024>kotlin NaturalNumberKt 3
Natural number

D:\Kotlin-Test\4-Dec-2024>kotlin NaturalNumberKt -3
Non Natural number

*/