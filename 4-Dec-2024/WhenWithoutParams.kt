fun main(args: Array<String>)
{
    val v11 = 11.5
    val v12 = "abc"
    when	{
        v11.equals(10) -> println("Its 10 ")
        v11.equals(11.5) -> println("Its 11.5 ")
        v12.contains("abc") -> println("Its abc ")
        else -> println("Invalid")
    }    
}



/*

D:\Kotlin-Test\4-Dec-2024>kotlinc WhenWithoutParams.kt

D:\Kotlin-Test\4-Dec-2024>kotlin WhenWithoutParamsKt
Its 11.5

*/