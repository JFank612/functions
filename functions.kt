import kotlin.math.PI

fun triangle(): Double {
    print("Enter the base:")
    val base = readLine()!!.toInt()

    print("Enter the height:")
    val height:Int = readLine()!!.toInt()

    val result = .5 * base * height
    return result
}

fun square(): Int {
    print("Enter the side:")
    val side:Int = readLine()!!.toInt()

    val result:Int= side * side
    return result
}

fun rectangle(): Int {
    print("Enter the width:")
    val width:Int = readLine()!!.toInt()

    print("Enter the height:")
    val height:Int = readLine()!!.toInt()

    val result = width * height
    return result
}

fun circle (): Double {
    print("Enter the radius")
    val radius:Int = readLine()!!.toInt()

    val result = PI * (radius * radius)
    return result
}


fun main(arg: Array<String>){


    println("1. Triangle")
    println("2. Square")
    println("3. Rectangle")
    println("4. Circle")
    print("Enter a number 1 - 4:")
    var number = readLine()!!.toInt()
    var result = 0.00



    when(number){
        1 -> result = triangle().toDouble()
        2 -> result = square().toDouble()
        3 -> result = rectangle().toDouble()
        4 -> result = circle().toDouble()
    }
println("$result")

}

