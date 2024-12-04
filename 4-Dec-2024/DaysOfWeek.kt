fun main(args: Array<String>)
{
    val b: Int = args[0].toInt()
    when(b){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid")
    }
}


/*

D:\Kotlin-Test\4-Dec-2024>kotlinc DaysOfWeek.kt

D:\Kotlin-Test\4-Dec-2024>kotlin DaysOfWeekKt 3
Tuesday

*/